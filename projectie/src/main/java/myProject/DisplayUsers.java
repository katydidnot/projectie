package myProject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class DisplayUsers extends HttpServlet{


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //ask questions about a controller? ACTIONS?
        response.setContentType("text/html");
        try
        {

            List<Projects> listProjects = ProjectDAO.displayProjects();

            String a = request.getParameter("currentGroupName"); // pull group name here.
            request.setAttribute("project", listProjects);
            request.setAttribute("currentGroupName",a);
            System.out.println(a);

            request.getRequestDispatcher("GroupDisplay.jsp").forward(request,response);


        } catch (ServletException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}