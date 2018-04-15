package myProject;

public class Groups
{
    private String users;
    private String name;
    private String projectsWorking;
    private String ideas;
    private String messages;
    private String projectsComplete;

    public void setUsers(String users)
    {
        this.users =  users;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setProjectsWorking(String projectsWorking)
    {
        this.projectsWorking = projectsWorking;
    }
    public void setIdeas(String ideas)
    {
        this.ideas = ideas;
    }
    public void setMessages(String messages)
    {
        this.messages = messages;
    }
    public void setProjectsComplete(String projectsComplete)
    {
        this.projectsComplete = projectsComplete;
    }
    public String getUsers()
    {
        return users;
    }

    public String getIdeas() {
        return ideas;
    }

    public String getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }

    public String getProjectsComplete() {
        return projectsComplete;
    }

    public String getProjectsWorking() {
        return projectsWorking;
    }

}
