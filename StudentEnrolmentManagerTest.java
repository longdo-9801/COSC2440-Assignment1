package Assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

class StudentEnrolmentManagerTest {
    ArrayList<Student> studentList;
    ArrayList<Course> courseList;
    ArrayList<StudentEnrolment> enrolList;
    String[] semesterList;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeAll
    public static void setUPClass() throws Exception{
        System.out.println("Class Start");
    }

    @BeforeEach
    public void setUp() throws Exception{
        System.out.println("Function Start");
    }

    public ArrayList<Student> createStuList() { //Populating a list of student
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S3630000", "John Smith", "1998/10/21"));
        studentList.add(new Student("S3632000", "Anne Ayler", "1998/04/19"));
        studentList.add(new Student("S3635661", "Lee Sun Kim", "1998/06/01"));
        studentList.add(new Student("S3630022", "Takanashi Kiara", "1998/10/21"));
        studentList.add(new Student("S3634050", "Do Vuong Trai", "1998/07/31"));
        studentList.add(new Student("S3630500", "Diarmuid Ua Duibhne", "1999/02/03"));
        studentList.add(new Student("S3637600", "Momo Nene", "1999/05/23"));
        studentList.add(new Student("S3638500", "John K. Astaroth", "2000/02/26"));
        studentList.add(new Student("S3630710", "Victor von Krakenstein Jr.", "2000/04/07"));
        studentList.add(new Student("S3630057", "John Smith", "2000/07/24"));
        return studentList;
    }

    public ArrayList<Course> createCouList() {
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course("NAV001", "Naval Engineering Basic", 12));
        courseList.add(new Course("NAV005", "Naval Ballistic: 14 to 16 inch artillery", 12));
        courseList.add(new Course("SAM001", "Surface-to-Air Missile 101", 12));
        return courseList;
    }

    public ArrayList<StudentEnrolment> createEnrolist () { //Create a enrollment list
        ArrayList<StudentEnrolment> enrolList = new ArrayList<>();
        enrolList.add(new StudentEnrolment("2020A", createStuList().get(0),createCouList().get(0)));
        enrolList.add(new StudentEnrolment("2020A", createStuList().get(0),createCouList().get(1)));
        enrolList.add(new StudentEnrolment("2020A", createStuList().get(1),createCouList().get(1)));
        enrolList.add(new StudentEnrolment("2021C", createStuList().get(0),createCouList().get(2)));
        return enrolList;
    }

    public String[] createSemList () { //Populating a semester list for easy lookup check.
        String[] semesterList = {"2020A", "2020B","2020C","2021A", "2021B","2021C","2022A", "2022B","2022C"};
        return semesterList;
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
        System.out.println("Class End");

    }

    @AfterEach
    public void tearDownFunction() throws Exception {
        System.out.println("Function End");
    }

    @Test
    public void addEnrol() throws Exception {
        System.out.println("Test addEnrol");

    }

    @Test
    void updateEnrol() throws Exception {
        System.out.println("Test updateEnrol");
    }

    @Test
    void deleteEnrol() throws Exception {
        System.out.println("Test deleteEnrol");
    }

    @Test
    void getOne() throws Exception {
        System.out.println("Test getOne");
    }

    @Test
    void getAll() throws Exception {
        System.out.println("Test getAll");
    }

    @Test
    void checkStudent() throws Exception {
        System.out.println("Test checkStudent");
        ArrayList<Student> List1 = createStuList();
        String input = "S3630000";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        assertEquals(StudentEnrolmentManager.checkStudent(List1),List1.get(0));
    }

    @Test
    void checkCourse() throws Exception {
        System.out.println("Test checkCourse");
        ArrayList<Course> List1 = createCouList();
        String input = "Nav001";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        assertEquals(StudentEnrolmentManager.checkCourse(List1),List1.get(0));
    }

    @Test
    void checkSemester() throws Exception {
        System.out.println("Test checkSemester");
        String[] List1 = createSemList();
        String input = "2020A";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        assertEquals(StudentEnrolmentManager.checkSemester(List1),"2020A");
    }

    @Test
    void multiEnrollmentQuery() throws Exception {
        System.out.println("Test multiEnrollmentQuery");
    }

    @Test
    void singleEnrollmentQuery() throws Exception {
        System.out.println("Test singleEnrollmentQuery");
    }

    @Test
    void queryStudent() throws Exception {
        System.out.println("Test queryStudent");
    }

    @Test
    void queryCourse() throws Exception {
        System.out.println("Test queryCourse");
    }

    @Test
    void querySemester() throws Exception {
        System.out.println("Test querySemester");
    }
}