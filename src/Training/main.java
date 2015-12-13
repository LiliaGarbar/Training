package Training;

import Training.userData.Profile;
import Training.userData.User1;
import Training.userData.User2;
import Training.userData.userTemplate;

public class main {

    static userTemplate userTemplate;
    static Profile profile;
    static User1 user1;
    static User2 user2;


    public static void main(String[] args) {

        userTemplate userTemplate = new userTemplate("Name", 00);
        Profile profile = new Profile(0, 'M', 0.0f, "Position", "Previous job", false);

        /*User1 user1 = new User1(0, 'M', 45.56f, "Dev.", "Engineer", false);
        user1.showData();*/

        User2 user2 = new User2(4, 'F', 250.34f, "killer", "Student", true);
        user2.showData();


    }
}
