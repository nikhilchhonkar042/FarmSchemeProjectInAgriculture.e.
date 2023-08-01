public class User {
    private String email;
    private String password;
    private UserType userType;

    public User(String email, String password, UserType userType) {
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    // Getters and setters (if required)

    // toString method for debugging and printing user details
    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                '}';
    }

	public UserType getUserType() {
		// TODO Auto-generated method stub
		return null;
	}
}
