package myProject;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import myProject.Ideas;

public class anIdeaDAO

{
        public static Connection getConnection() {
                Connection conn = null;
                try {

                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/plumeproject?" +
                                "user=root&password=heykid23");
                } catch (SQLException ex) {
                        //learn more about this. you don't fully understand it.
                        System.out.println("SQLException: " + ex.getMessage());
                        System.out.println("SQLState: " + ex.getSQLState());
                }
                return conn;
        }

        public static boolean createIdea(String idea)
        {
                boolean createIdea =false;
                try {
                        Connection conn = anIdeaDAO.getConnection();
                        PreparedStatement created = conn.prepareStatement("insert into idea (theIdea) values (?)");
                        created.setString(1,idea);
                        created.executeUpdate();
                        createIdea = true;
                        conn.close();

                } catch (SQLException ex) {
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        }
        return createIdea;
        }

        public static List<Ideas> displayIdeas()
        {
                List<Ideas> ideaList = new ArrayList<Ideas>();
                try {

                        Statement statement = anIdeaDAO.getConnection().createStatement();
                        ResultSet rs = statement.executeQuery("select * from idea");
                        while (rs.next()) {
                                String ideaDetail = rs.getString("theIdea");
                                Ideas idea = new Ideas(ideaDetail);
                                ideaList.add(idea);
                        }

                }
                catch(SQLException ex){
                        System.out.println("SQLException: " + ex.getMessage());
                        System.out.println("SQLState: " + ex.getSQLState());
                }
        return ideaList;

        }



}