package Assignment1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Populating a list of course
        ArrayList<Course> courseList = new ArrayList<Course>();
        courseList.add(new Course("NAV001","Naval Engineering Basic",12));
        courseList.add(new Course("NAV005","Naval Ballistic, 14 to 16 inch artillery",12));
        courseList.add(new Course("SAM001","Surface-to-Air Missile 101",12));
        //Populating a list of student
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("S3630000", "John Smith","1998-10-21"));
        studentList.add(new Student("S3632000", "Anne Ayler","1998-04-19"));
        studentList.add(new Student("S3635661", "Lee Sun Kim","1998-06-01"));
        studentList.add(new Student("S3630022", "Takanashi Kiara","1998-10-21"));
        studentList.add(new Student("S3634050", "Do Vuong Trai","1998-07-31"));
        studentList.add(new Student("S3630500", "Diarmuid Ua Duibhne","1999-02-03"));
        studentList.add(new Student("S3637600", "Momo Nene","1999-05-23"));
        studentList.add(new Student("S3638500", "John K. Astaroth","2000-02-26"));
        studentList.add(new Student("S3630710", "Victor von Krakenstein Jr.","2000-04-07"));
        studentList.add(new Student("S3630057", "John Smith","2000-07-24"));
        //Testing population. Code start below this line.
//        for (Course course : courseList) { //Print course list
//            System.out.println(course.toString());
//        }
//        for (Student student : studentList) { //Print course list
//            System.out.println(student.toString());
//        }
        //Code ended above this line









    }
}
