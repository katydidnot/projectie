package myProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");

        String a = request.getParameter("username");
        String b = request.getParameter("password");
        try {

            if (UserDao.validLogin(a,b)) {
                HttpSession session = request.getSession();
                session.setAttribute("name", a);
                RequestDispatcher rd = request.getRequestDispatcher("/HomePage.jsp");
                rd.forward(request, response);

            }
            else
            {
                System.out.println("sorry, incorrect login");
            }

        }
        catch (ServletException ex)
        {
            System.out.println(ex.getMessage());
        }


    }
    }
