package myProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroupServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        String a = request.getParameter("group");
        try{
            if(GroupDAO.createGroup(a))
            {
                List<Groups> group = GroupDAO.displayGroups();
                request.setAttribute("group", group);
                RequestDispatcher rd = request.getRequestDispatcher("GroupWelcomePage.jsp");
                rd.forward(request,response);

            }
            else
            {
                System.out.println("Sorry you didn't enter anything!");
                RequestDispatcher rd = request.getRequestDispatcher("CreateGroup.jsp");
            }}
        catch (ServletException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

