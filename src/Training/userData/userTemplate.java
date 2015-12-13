package Training.userData;

public class userTemplate {

    private String userName;
    private int password;
    private Profile profile;

    public userTemplate(String userName, int password, Profile profile) {
        this.userName = userName;
        this.password = password;
    }

    public userTemplate(String userName) {
        this.userName = userName;
    }

    public userTemplate(String userName, int password) {
        this.userName = userName;
        this.password = password;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "1.Username: " + userName + ";" + " 2.Password: " + password;
    }


}

