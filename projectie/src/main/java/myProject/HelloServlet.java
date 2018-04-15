package myProject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

    public class HelloServlet extends HttpServlet {

        public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
                throws IOException {
            try {
                // The newInstance() call is a work around for some
                // broken Java implementations

                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (Exception ex) {
                System.out.println("ERROR: "+ ex.getMessage());
            }
            Connection conn = null;

            try {
                conn =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/projecto?" +
                                "user=root&password=heykid23");

                // Do something with the Connection

               // PreparedStatement pS = conn.PrepareStatement("insert into messagesPrivate ")//
            } catch (SQLException ex) {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }



        }
    }



