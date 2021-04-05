package Assignment1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {//implements StudentEnrolmentManager {

    public boolean endProgram() {
        boolean inputCheck = false;
        boolean output;
        while (!inputCheck) {
            System.out.println("Do you want to end the program(Y/N):");
            Scanner ynScanner = new Scanner(System.in);
            if ((ynScanner.nextLine()).equalsIgnoreCase(String.valueOf('y'))) {
                return true;
            } else if ((ynScanner.nextLine()).equalsIgnoreCase(String.valueOf('n'))) {
                return false;
            } else {
                System.out.println("Please input only y or n.");
            }
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        ArrayList<StudentEnrolment> enrolList = new ArrayList<StudentEnrolment>();
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
        /*
        for (Course course : courseList) { //Print course list
            System.out.println(course.toString());
        }
        for (Student student : studentList) { //Print course list
            System.out.println(student.toString());
        }

         */
        //Code ended above this line

        //Menu codes below this line
        boolean endProgram = false;
        while (!endProgram) {
            Scanner reportSelectorInput = new Scanner(System.in);
            byte input = 0;

            System.out.println("Welcome to the \"Student Enrolment Manager\"\n" +
                    "Please choose the action you wish to perform:\n" +
                    "1. Add a new enrolment.\n" +
                    "2. Update an existing enrolment.\n" +
                    "3. Delete an enrolment.\n" +
                    "4. Display and export an enrolment.\n" +
                    "5. Display and export all enrolment.\n" +
                    "--------------------------------------------------------------------------------------");

            boolean selectorCheck = true;

            while (selectorCheck) {
                //Input screening
                try {
                    System.out.print("Enter your selection here(1, 2, 3, 4 or 5): ");
                    input = reportSelectorInput.nextByte();
                    if (input >= 1 && input <= 5) {
                        selectorCheck = false;
                    } else {
                        System.out.println("Please enter only 1, 2, 3, 4 or 5");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Please enter only 1, 2, 3, 4 or 5");
                    reportSelectorInput.next();
                }
            }

            switch (input) {
                case 1:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 1...");
                    System.out.println();// For aesthetic purpose only
                    StudentEnrolmentManager.addEnrol(enrolList,courseList,studentList);
                    break;

                case 2:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 2...");
                    System.out.println();// For aesthetic purpose only
                    StudentEnrolmentManager.updateEnrol(enrolList,courseList,studentList);
                    break;

                case 3:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 3...");
                    System.out.println();// For aesthetic purpose only
                    StudentEnrolmentManager.updateEnrol(enrolList,courseList,studentList);
                    break;
                case 4:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 4...");
                    System.out.println();// For aesthetic purpose only
                    //try {StudentEnrolmentManager.getOne(enrolList,courseList,studentList);} catch (FileNotFoundException ignored) {
                    //}
                    break;
                case 5:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 5...");
                    System.out.println();// For aesthetic purpose only
                    //try {StudentEnrolmentManager.getAll(enrolList,courseList,studentList);} catch (FileNotFoundException ignored) {
                    //}
                    break;
            }
        }










    }
}
