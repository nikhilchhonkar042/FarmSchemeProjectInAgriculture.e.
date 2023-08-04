package Admin;

public class AdminPojo {
    private String email;
    private String password;

    public AdminPojo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Add getters and setters for email and password
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
