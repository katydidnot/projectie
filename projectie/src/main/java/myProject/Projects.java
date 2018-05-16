package myProject;

public class Projects {
    private boolean isComplete;
    private String name;
    private int id;
    public Projects (String name, boolean isComplete, int id )
    {
        this.name = name;
        this.isComplete = isComplete;
        this.id = id;
    }

    private void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public boolean getIsComplete() {
        return isComplete;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString()
    {
        return String.format(name);
    }

}