package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrolment{
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

    @Override
    public String toString() {
        return "Enrollment: " + students.getsName()
                + "(" + students.getsID() + ")" + " in "
                + courses.getcName()
                + "(" + courses.getcID() + ")" + " in semester "
                + semester;
    }
}
