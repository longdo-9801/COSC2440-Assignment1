package Assignment1;

import java.util.Scanner;

public class StudentEnrolment implements StudentEnrolmentManager  {
    private String sID;
    private String cID;
    private String semester;

    public StudentEnrolment(String sID, String cID, String semester) {
        this.sID = sID;
        this.cID = cID;
        this.semester = semester;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public void addEnrol() {
        Scanner inputer = new Scanner(System.in);
        System.out.println("Please enter the student id of the student you wish to enroll: ");
        String sIDInput = inputer.nextLine();
        System.out.println("Please enter the targeted semester: ");
        String semesterInput = inputer.nextLine();

        StudentEnrolment enrolment = new StudentEnrolment(sIDInput, getcID(), semesterInput);


        
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
    @Override
    public String toString() {
        return "StudentEnrolment{" +
                "sID='" + sID + '\'' +
                ", cID='" + cID + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
