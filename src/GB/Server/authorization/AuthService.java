package GB.Server.authorization;

public interface AuthService {
    void start();
    String getNickNameByLoginAndPassword(String login, String password);
    void end();
}
