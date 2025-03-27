import java.util.*;

public class User {
    private final String username;
    private String password;

    public User(String username, String password) {
        this.username = validateUsername(username);
        this.password = validatePassword(password);
    }

    private String validateUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        return username.trim();
    }

    private String validatePassword(String password) {
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        }
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (authenticate(oldPassword)) {
            this.password = validatePassword(newPassword);
            return true;
        }
        return false;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
