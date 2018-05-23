package myProject;

import java.sql.*;

public class UserDao {
    public static Connection getConnection() {
        Connection conn = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productava?" +
                    "user=root&password=heykid23");
        } catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return conn;
    }

    public static boolean validLogin(String username, String password) {
        boolean loggedIn = false;
        try {

            Connection conn = UserDao.getConnection();
            PreparedStatement checkUser = conn.prepareStatement("Select * from User where username = ? and password = ? ");
            checkUser.setString(1, username);
            System.out.println(username);
            System.out.println(password);
            checkUser.setString(2, password);
            ResultSet rs = checkUser.executeQuery();
            loggedIn = rs.next();


        } catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return loggedIn;
    }

    public static boolean addUser (String username, String password)

    {
        boolean userCreated = false;
        try {

            Connection conn = UserDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("Insert into User (username, password) values (?,?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
            userCreated = true;

            }
        catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return userCreated;
    }


}




