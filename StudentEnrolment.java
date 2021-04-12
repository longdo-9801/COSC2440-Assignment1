package Assignment1;

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

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Enrollment: " + students.getsName()
                + "(" + students.getsID() + ")" + " in "
                + courses.getcName()
                + "(" + courses.getcID() + ")" + " in semester "
                + semester;
    }

    public String toCSV() {
        return  students.toCSV() + "," +
                courses.toCSV() + "," +
                this.getSemester() ;
    }
}
