package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrolment {//implements StudentEnrolmentManager{
    private String semester;
    private Student students;
    private Course courses;

    public StudentEnrolment(String semester, Student students, Course courses) {
        this.semester = semester;
        this.students = students;
        this.courses = courses;
    }

    public String getSemester() {
        return semester;
    }

    public Student getStudents() {
        return students;
    }

    public Course getCourses() {
        return courses;
    }
//    @Override
//    public void addEnrol(ArrayList<StudentEnrolment> enrolmentsArray) {
//        Scanner inputer = new Scanner(System.in);
//        System.out.println("Please enter the student id of the student you wish to enroll: ");
//        String sIDInput = inputer.nextLine();
//        System.out.println("Please enter the course id of the student you wish to enroll: ");
//        String cIDInput = inputer.nextLine();
//        System.out.println("Please enter the targeted semester: ");
//        String semesterInput = inputer.nextLine();
//        enrolmentsArray.add(new StudentEnrolment(sIDInput, cIDInput, semesterInput));
//        return;
//    }
//
//    @Override
//    public void updateEnrol(ArrayList<StudentEnrolment> enrolmentsArray) {
//
//    }
//
//    @Override
//    public void deleteEnrol(ArrayList<StudentEnrolment> enrolmentsArray) {
//
//    }
//
//    @Override
//    public void getOne(ArrayList<StudentEnrolment> enrolmentsArray) {
//
//    }
//
//    @Override
//    public void getAll(ArrayList<StudentEnrolment> enrolmentsArray) {
//
//    }


    @Override
    public String toString() {
        return "Enrollment: " + students.getsName()
                + "(" + students.getsID() + ")" + " in "
                + courses.getcName()
                + "(" + courses.getcID() + ")" + " in semester "
                + semester;
    }
}
