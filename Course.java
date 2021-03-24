package Assignment1;
import java.util.Scanner;

public class Course implements StudentEnrolmentManager {
    private String cID;
    private String cName;
    private int credits;

    public Course(String cID, String cName, int credits) {
        this.cID = cID;
        this.cName = cName;
        this.credits = credits;
    }

    public String getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public void addEnrol() {
        Scanner inputer = new Scanner(System.in);
        System.out.println("Please enter the student id of the student you wish to enroll: ");
        String sIDInput = inputer.nextLine();
        System.out.println("Please enter the targeted semester: ");
        String semesterInput = inputer.nextLine();

        StudentEnrolment enrolment = new StudentEnrolment(sIDInput, getcID(), semesterInput);
        System.out.println(enrolment.toString());
    }

    @Override
    public void updateEnrol() {

    }

    @Override
    public void deleteEnrol() {

    }

    @Override
    public void getOne() {

    }

    @Override
    public void getAll() {

    }
}
