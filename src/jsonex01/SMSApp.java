package jsonex01;

// Dto => Data Transper Object (통신을 위한 클래스. Json으로 바꿔야 함)
class UserDto1 {
    private String username;
    private String password;
    
    public UserDto1(String username, String password) {
        this.username = username;
        this.password = password;
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
}

public class SMSApp {
    public static void main(String[] args) {
        MySMS.send("01098754616", "ㅠㅠ");
    }
}
