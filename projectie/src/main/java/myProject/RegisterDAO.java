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
            PreparedStatement userRegistered = conn.prepareStatement("insert into users values (?,?,?)");
            userRegistered.setString(1,email);
            userRegistered.setString(2,password);
            userRegistered.setString(3,username);
            userRegistered.executeUpdate();
            userRegistered.close();
            registered =true;
            System.out.println(email);
            System.out.println(password);
            System.out.println(username);
    }
    catch(SQLException ex)
    {
    }
        return registered;

    }

}
