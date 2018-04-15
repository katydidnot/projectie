package myProject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

import javax.servlet.http.HttpServlet;

public class Register extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
        response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        String a = request.getParameter("email");
        String b = request.getParameter("password");
        String c = request.getParameter("username");

        try
        {
        if(RegisterDAO.validation(a,b,c))
        {
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request,response);
        }
        else
        {
            System.out.println(" Sorry, can't register you! ");
        }
        }
        catch (ServletException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
