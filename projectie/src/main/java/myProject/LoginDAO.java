package myProject;

import java.sql.*;

public class LoginDAO
{


    public static boolean validation(String email, String password)
    {
        boolean loggy = false;

        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/plumeproject?" +
                    "user=root&password=heykid23");
            PreparedStatement userTrue = conn.prepareStatement("Select * from users where email = ? and password= ?");
            userTrue.setString(1,email);
            userTrue.setString(2,password);

            ResultSet rs = userTrue.executeQuery();
            loggy =rs.next();//look into this figure it out.
            conn.close();
        }
        catch(SQLException ex)
        {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return loggy;

        // do i want a close here? or keep it open?
    }

}
