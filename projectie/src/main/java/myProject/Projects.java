package myProject;

public class Projects {
    private String users;
    private String tasks;
    private boolean isComplete;
    private String groupQs;
    private String ideas;

    private void setUsers(String users) {
        this.users = users;
    }
    private void setTasks(String tasks) {
        this.tasks = tasks;
    }

    private void setIsComplete(boolean isComplete)
    {
    this.isComplete =isComplete;
    }
    private void setGroupQs(String groupQs)
    {
        this.groupQs = groupQs;
    }
    private void setIdeas(String ideas)
    {
        this.ideas = ideas;
    }
    public String getUsers()
    {
        return users;
    }
    public String getTasks()
    {
        return tasks;
    }
    public boolean getIsComplete()
    {
        return isComplete;
    }
    public String getGroupQs()
    {
        return groupQs;

    }
    public String getIdeas()
    {
        return ideas;
    }

}
