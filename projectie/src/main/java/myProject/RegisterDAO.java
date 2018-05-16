package myProject;

import java.sql.*;

public class RegisterDAO {

    public static boolean validation (String email, String password, String username)
    {
        boolean registered =false;
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/plumeproject?" +
                    "user=root&password=heykid23");
            PreparedStatement userRegistered = conn.prepareStatement("insert into users (email, password, username) values (?,?,?)");
            userRegistered.setString(1,email);
            userRegistered.setString(2,password);
            userRegistered.setString(3,username);
            userRegistered.executeUpdate();
            userRegistered.close();
            registered =true;
            int id = 0;
            User user = new User(email, password, username, id);

    }
    catch(SQLException ex)
    {
    }
        return registered;

    }

}
