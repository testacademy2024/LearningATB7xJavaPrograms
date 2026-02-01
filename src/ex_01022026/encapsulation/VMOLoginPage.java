package ex_01022026.encapsulation;

public class VMOLoginPage {
    private String username;
    private String password;
    private String signINButton;

    public String getPassword() {
        return password;
    }

    public String getSignINButton() {
        return signINButton;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
