package myProject;
import java.text.DateFormatSymbols;
public class Product {

    private int id;
    private String name;
    private String category;
    private int startDate;
    private int endDate;

    public Product(int id, String name, String category, int startDate, int endDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(int startDate)
    {
        this.startDate = startDate;
    }
    public void setEndDate(int endDate)
    {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    public int getStartDate()
    {
        return startDate;
    }
    public int getEndDate()
    {
        return endDate;
    }




    public String getMonthStartDate(int startDate) {
        return new DateFormatSymbols().getMonths()[startDate-1];
    }

    public String getMonthEndDate(int endDate) {
        return new DateFormatSymbols().getMonths()[endDate-1];
    }


    @Override
    public String toString() {
        return String.format(name, category, getMonthStartDate(startDate), getMonthEndDate(endDate));

    }


}