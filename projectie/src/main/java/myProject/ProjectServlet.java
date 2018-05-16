package myProject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProjectServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //ask questions about a controller? ACTIONS?
        response.setContentType("text/html");
        try
        {

            //List<User> userListGroup = GroupDAO.displayUsersGroups();
            String a = request.getParameter(""); // pull group name here.
            //request.setAttribute("user", userListGroup);
            //request.setAttribute("groupName",a);
            request.getRequestDispatcher("GroupDisplay.jsp").forward(request,response);


        } catch (ServletException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
