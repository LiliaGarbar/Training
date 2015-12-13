package Training.userData;

public class User2 extends Profile {

    float avarageSalary;

    {
        avarageSalary = 250.34f;
    }

    String position;

    {
        position = "Killer";
    }

    int friends;

    {
        friends = 10;
    }


    public User2(int friends, char gender, float avarageSalary, String position, String previousJob, boolean readyToVacation) {
        super(friends, gender, avarageSalary, position, previousJob, readyToVacation);
    }

    @Override
    public void showData() {
        if (avarageSalary <= 300 && position == "Killer") {
            System.out.println("Big brother is watching you!!!");
        } else {
            System.out.println("Hou-hou-hou!");
        }
    }
}
