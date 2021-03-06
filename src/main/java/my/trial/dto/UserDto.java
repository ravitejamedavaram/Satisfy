package my.trial.dto;

public class UserDto {

    private String username;
    private String password;
    private String email;
    private boolean added;

    public UserDto() {
    }

    public UserDto(boolean added) {
        this.added = added;
    }

    public UserDto(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
