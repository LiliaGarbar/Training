package Training.userData;

public class Profile {

    private int friends;
    private char gender;
    private float avarageSalary;
    private String position;
    private String previousJob;
    private boolean readyToVacation;
    private userTemplate userTemplate;

    public Profile(Training.userData.userTemplate userTemplate) {
        this.userTemplate = userTemplate;
    }

    public Training.userData.userTemplate getUserTemplate() {
        return userTemplate;
    }

    public void setUserTemplate(Training.userData.userTemplate userTemplate) {
        this.userTemplate = userTemplate;
    }

    public Profile(int friends, char gender, float avarageSalary, String position, String previousJob, boolean readyToVacation) {
        this.friends = friends;
        this.gender = gender;
        this.avarageSalary = avarageSalary;
        this.position = position;
        this.previousJob = previousJob;
        this.readyToVacation = readyToVacation;
    }

    public int getFriends() {
        return friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getAvarageSalary() {
        return avarageSalary;
    }

    public void setAvarageSalary(float avarageSalary) {
        this.avarageSalary = avarageSalary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPreviousJob() {
        return previousJob;
    }

    public void setPreviousJob(String previousJob) {
        this.previousJob = previousJob;
    }

    public boolean getReadyToVacation() {
        return readyToVacation;
    }

    public void setReadyToVacation(boolean readyToVacation) {
        this.readyToVacation = readyToVacation;
    }

    public void showData() {

        System.out.println("Username: " + userTemplate);
        System.out.println("Password: " + userTemplate);
        System.out.println("Friends: " + friends);
        System.out.println("Gender: " + gender);
        System.out.println("Avarage salary per year: " + avarageSalary);
        System.out.println("Position: " + position);
        System.out.println("Previous job: " + previousJob);
        System.out.println("Ready for work vacations: " + readyToVacation);

    }


}
