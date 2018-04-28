package myProject;

public class User {
    private String email;
    private String password;
    private String username;
    private int id;
    public User (String email, String password, String username, int id)
    {
        this.email = email;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setUsename(String username)
    {
        this.username = username;
    }
    public void setId(int id)
    {
        this.id =id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername()
    {
        return username;
    }
    public int getId()
    {
        return id;
    }
    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    @Override
    public String toString()
    {
        return String.format(username, email);
    }
}
