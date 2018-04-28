
package myProject;
        import javafx.scene.Group;

        import java.sql.*;
        import java.util.List;
        import java.util.ArrayList;
public class GroupDAO {

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

    public static boolean createGroup(String group) {
        boolean createGroup = false;
        try {
            Connection conn = GroupDAO.getConnection();
            PreparedStatement created = conn.prepareStatement("insert into groups (groupName) values (?)");
            created.setString(1, group);
            created.executeUpdate();
            createGroup = true;
            conn.close();

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return createGroup;
    }

    public static List<Groups> displayGroups() {
        List<Groups> groupList = new ArrayList<Groups>();
        try {

            Statement statement = GroupDAO.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("select * from groups");
            while (rs.next()) {
                String name = rs.getString("groupName");
                int id = rs.getInt("groupId");
                Groups group = new Groups(name, id);
                groupList.add(group);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return groupList;


    }
}