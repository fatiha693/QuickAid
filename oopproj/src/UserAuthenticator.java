import java.util.Map;

public interface UserAuthenticator {
    boolean registerUser(String username, String password);
    boolean authenticateUser(String username, String password);
}