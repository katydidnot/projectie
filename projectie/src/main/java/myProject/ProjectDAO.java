package myProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectDAO
{
    public static Connection getConnection() {
        Connection conn = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/plumeproject?" +
                    "user=root&password=heykid23");
        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return conn;
    }
    public static boolean createProject(String project)
    {
        boolean createProject = false;
        try {
            Connection conn = ProjectDAO.getConnection();
            PreparedStatement created = conn.prepareStatement("insert into projects (projectName) values (?)");
            created.setString(1, project);
            created.executeUpdate();
            createProject = true;
            conn.close();

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return createProject;
    }
    public static List<Projects> displayProjects() {
        List<Projects> projectList = new ArrayList<Projects>();
        try {

            Statement statement = GroupDAO.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("select projectId from groups ");
            while (rs.next()) {
                String name = rs.getString("projectName");
                int id = rs.getInt("projectId");
                boolean isComplete =rs.getBoolean("isComplete");
                Projects project = new Projects(name, isComplete, id);
                projectList.add(project);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return projectList;


    }

}
