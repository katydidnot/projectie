package myProject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IdeaServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String a = request.getParameter("idea");
            System.out.println(a);
        try{
            if(anIdeaDAO.createIdea(a))
            {
                RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                rd.forward(request,response);
            }
            else
            {
                out.println("Sorry you didn't enter anything!");
                RequestDispatcher rd = request.getRequestDispatcher("CreateIdea.jsp");
            }}
        catch (ServletException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

