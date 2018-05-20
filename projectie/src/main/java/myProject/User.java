package myProject;

public class User {
    private String username;
    private int userId;
    private String password;

    public User(int userId, String password, String username)
    {
        this.userId = userId;
        this.password = password;
        this.username =username;

    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getUsername()
    {
        return username;
    }
    public int getUserId()
    {
        return userId;
    }
    public String getPassword()
    {
        return password;
    }
    @Override
    public String toString() {
        return String.format(username);

    }

}
