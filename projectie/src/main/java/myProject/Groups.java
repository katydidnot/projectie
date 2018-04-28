package myProject;

public class Groups
{

    private String name;
    private int id;

    public Groups (String name, int id)
    {
        this.name =name;
        this.id =id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return String.format(name);
    }
    }


