package myProject;
import java.text.DateFormatSymbols;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.*;

public class ProductDao
{


    public static Connection getConnection() {
        Connection conn = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productava?" +
                    "user=root&password=heykid23");
        } catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return conn;
    }
    public static boolean addProduct(String productName, String productCategory, int startDate, int endDate)
    {
        boolean addedProduct = false;
        try {
            Connection conn = ProductDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("Insert into Product (productName, productCategory, startDate, endDate) values (?,?,?,?)");
            ps.setString(1, productName);
            ps.setString(2, productCategory);
            ps.setInt(3, startDate);
            ps.setInt(4, endDate);
            ps.executeUpdate();
            addedProduct = true;

        }
        catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return addedProduct;
    }

    public static List<Product> getProductAvail(String currentCategory)
    {
        List<Product> productAvailList = new ArrayList<Product>();
        try {
            Connection conn = ProductDao.getConnection();
            int currentMonth = Calendar.getInstance().get(Calendar.MONTH)+1;
            PreparedStatement ps = conn.prepareStatement("select * from Product where (?) BETWEEN startDate AND endDate AND productCategory = ?");
            ps.setInt(1, currentMonth);
            ps.setString(2, currentCategory);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("idProduct");
                String name = rs.getString("productName");
                String category = rs.getString("productCategory");
                int startDate = rs.getInt("startDate");
                int endDate = rs.getInt("endDate");
                Product product = new Product(id, name, category, startDate, endDate);
                productAvailList.add(product);

            }
        }
        catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return productAvailList;
    }

    public static List<Product> productSearch(String productSearched)
    {
        List<Product> likeProducts = new ArrayList<Product>();
        try{
            Connection conn = ProductDao.getConnection();
            String a = productSearched;
            PreparedStatement ps = conn.prepareStatement("Select * from Product WHERE productName like (?)");
            ps.setString(1, "%" + a + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idProduct");
                String name = rs.getString("productName");
                String category = rs.getString("productCategory");
                int startDate = rs.getInt("startDate");
                int endDate = rs.getInt("endDate");
                Product product = new Product(id, name, category, startDate, endDate);
                likeProducts.add(product);
            }

        }
        catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return likeProducts;
    }
    public static boolean deleteProduct(String productName)
    {
        boolean deletedProduct = false;
        try {
            Connection conn = ProductDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("Delete from Product where productName = (?)");
            ps.setString(1, productName);
            ps.executeUpdate();
            deletedProduct = true;

        }
        catch (SQLException ex) {
            //learn more about this. you don't fully understand it.
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return deletedProduct;
    }

    public static List<Product> getProduct(String productName)
    {
        List<Product> getProducts = new ArrayList<Product>();
        Connection conn = ProductDao.getConnection();
        try
        {
            String a = productName;
            PreparedStatement ps = conn.prepareStatement("SELECT * from Product where productName = (?)");
            ps.setString(1, a);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idProduct");
                String name = rs.getString("productName");
                String category = rs.getString("productCategory");
                int startDate = rs.getInt("startDate");
                int endDate = rs.getInt("endDate");
                Product product = new Product(id, name, category, startDate, endDate);
                getProducts.add(product);
                System.out.println(getProducts);
            }
        }
        catch (SQLException ex) {

        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        }
        return getProducts;
    }
    public static int getProductid(String productName)
    {
        int id = 0;
        try {
            Connection conn = ProductDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT idProduct from Product where productName = ?");
            ps.setString(1, productName);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                id = rs.getInt(1);
            }
        }
        catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return id;
    }
    public static String getStartDateInt(int id )
    {
        int start = 0;
        try {
            Connection conn = ProductDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT startDate from Product where idProduct = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                start= rs.getInt(1);
            }
        }
        catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return new DateFormatSymbols().getMonths()[start-1];

    }
    public static String getEndDateInt(int id)
    {
        int end = 0;
        try {
            Connection conn = ProductDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT endDate from Product where idProduct = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                end= rs.getInt(1);
            }
        }
        catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return new DateFormatSymbols().getMonths()[end-1];

    }

    public static String getProductCategory(int id)
    {
        String productCategory = "";
        try {
            Connection conn = ProductDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT productCategory from Product where idProduct = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                productCategory= rs.getString(1);
            }
        }
        catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return productCategory;

    }

    public static boolean updateProduct(String productName, String productCategory, int startDate, int endDate)
    {
        boolean updated = false;
        try {
            Connection conn = ProductDao.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE product SET productCategory = (?), startDate =(?), endDate WHERE productName =(?)");
            ps.setString(1, productCategory);
            ps.setInt(2, startDate);
            ps.setInt(3, endDate);
            ps.setString(4, productName);
            ps.executeUpdate();
            updated = true;


        }
        catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
        return updated;
    }

}
