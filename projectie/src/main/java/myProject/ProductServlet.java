package myProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String a = request.getParameter("productName");
        String b = request.getParameter("productCategory");
        String parseOne =  request.getParameter("startDate");
        System.out.println(parseOne);
        String parseTwo = request.getParameter("endDate");
        System.out.println(parseTwo);
        int c = Integer.parseInt(parseOne);
        int d = Integer.parseInt(parseTwo);

        try {

            if (ProductDao.addProduct(a, b, c, d)) {

                RequestDispatcher rd = request.getRequestDispatcher("/HomePage.jsp");
                rd.forward(request, response);

            }
        } catch (ServletException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String q = request.getParameter("currentCategory");

        try {

            List <Product> products =  ProductDao.getProductAvail(q);
            request.setAttribute("products", products);
            request.setAttribute("category", q);
            RequestDispatcher rd = request.getRequestDispatcher("/ProductListAvailable.jsp");
            rd.forward(request, response);

        }

        catch (ServletException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
