package myProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String a = request.getParameter("productSearch");

        try {

            List<Product> products =  ProductDao.productSearch(a);
            request.setAttribute("products", products);
            request.setAttribute("searchTerm" , a);
            RequestDispatcher rd = request.getRequestDispatcher("/ProductSearchResults.jsp");
            rd.forward(request, response);

        }

        catch (ServletException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
