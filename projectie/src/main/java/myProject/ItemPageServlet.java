package myProject;
import java.util.*;
import javax.persistence.spi.ProviderUtil;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ItemPageServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String q = request.getParameter("productName");
        try {

            int productId = ProductDao.getProductid(q);
            String a = q;
            String b = ProductDao.getProductCategory(productId);
            String c = ProductDao.getStartDateInt(productId);
            String d = ProductDao.getEndDateInt(productId);
                request.setAttribute("productName", a);
                request.setAttribute("productCategory", b);
                request.setAttribute("startDate", c);
                request.setAttribute("endDate", d);
            RequestDispatcher rd = request.getRequestDispatcher("/ItemPage.jsp");
            rd.forward(request, response);
            }
        catch (ServletException ex) {
            System.out.println(ex.getMessage());
             }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String a = request.getParameter("productName");
        String b = request.getParameter("productCategory");
        String parseOne =  request.getParameter("startDate");
        String parseTwo = request.getParameter("endDate");

        int c = Integer.parseInt(parseOne);
        int d = Integer.parseInt(parseTwo);

        try {

            if (ProductDao.updateProduct(a, b, c, d)) {

                RequestDispatcher rd = request.getRequestDispatcher("/HomePage.jsp");
                rd.forward(request, response);

            }
        } catch (ServletException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
