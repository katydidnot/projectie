package myProject;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class WelcomeServlet extends HttpServlet
{


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String a = request.getParameter("email");
        String b = request.getParameter("password");

        try{
        if(LoginDAO.validation(a,b))
        {

            List<Ideas> ideas = anIdeaDAO.displayIdeas();
            request.setAttribute("idea", ideas);

            List<Groups> group = GroupDAO.displayGroups();
            request.setAttribute("group", group);
            RequestDispatcher rd = request.getRequestDispatcher("GroupWelcomePage.jsp");
            rd.forward(request,response);


        }
        else
        {
            out.println("Sorry email or password is incorrect.");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");//mapping issue w/xml servlet?
        }}
        catch (ServletException ex)
        {
        System.out.println(ex.getMessage());
        }
    }
}
