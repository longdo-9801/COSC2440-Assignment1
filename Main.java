package Assignment1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {//implements StudentEnrolmentManager {

    public static boolean endProgram() {
        System.out.println("--------------------------------------------------------------------------------------");
        boolean inputCheck = false;
        while (!inputCheck) {
            System.out.println("Do you want to end the program(Y/N):");
            Scanner ynScanner = new Scanner(System.in);
            String input = ynScanner.nextLine();
            if (input.equalsIgnoreCase(String.valueOf('y'))) {
                return true;
            } else if (input.equalsIgnoreCase(String.valueOf('n'))) {
                return false;
            } else {
                System.out.println("Please input only y or n.");
            }
        }
        return false;
    }

    public static void addStudent() {

    }

    public static void displayList(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList) {
        Scanner reportSelectorInput = new Scanner(System.in);
        byte input = 0;
        System.out.println("Please select which list to display\n" +
                "1. Display the student list.\n" +
                "2. Display the course list.\n" +
                "3. Display the enrollment list.\n" +
                "--------------------------------------------------------------------------------------");

        boolean selectorCheck = true;

        while (selectorCheck) {
            //Input screening
            try {
                System.out.print("Enter your selection here(1, 2, or 3): ");
                input = reportSelectorInput.nextByte();
                if (input >= 1 && input <= 3) {
                    selectorCheck = false;
                } else {
                    System.out.println("Please enter only 1, 2, or 3");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter only 1, 2, or 3");
                reportSelectorInput.next();
            }
        }
        System.out.println("Displaying selected list...");
        switch (input) {
            case 1:
                for (Student studentPointer : studentList)
                    System.out.println(studentPointer);
                break;
            case 2:
                for (Course coursePointer : courseList)
                    System.out.println(coursePointer);
                break;
            case 3:
                for (StudentEnrolment enrolPointer : enrolList)
                    System.out.println(enrolPointer);
                break;
        }
    }



    public static void main(String[] args) {
	// write your code here

        // Populating a list of course
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course("NAV001","Naval Engineering Basic",12));
        courseList.add(new Course("NAV005","Naval Ballistic: 14 to 16 inch artillery",12));
        courseList.add(new Course("SAM001","Surface-to-Air Missile 101",12));
        //Populating a list of student
        ArrayList<Student> studentList = new ArrayList<>();
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
        //Populating a semester list for easy lookup check.
        String[] semesterList = {"2020B", "2020C","2021A"};
        //Create a enrollment list
        ArrayList<StudentEnrolment> enrolList = new ArrayList<>();
        enrolList.add(new StudentEnrolment("2020A", studentList.get(0),courseList.get(0)));
        enrolList.add(new StudentEnrolment("2020A", studentList.get(0),courseList.get(1)));
        enrolList.add(new StudentEnrolment("2020A", studentList.get(1),courseList.get(1)));
        enrolList.add(new StudentEnrolment("2021C", studentList.get(0),courseList.get(2)));


        //Menu codes below this line
        boolean endProgramCheck = false;
        while (!endProgramCheck) {
            Scanner reportSelectorInput = new Scanner(System.in);
            byte input = 0;

            System.out.println("Welcome to the \"Student Enrolment Manager\"\n" +
                    "Please choose the action you wish to perform:\n" +
                    "1. Add a new enrolment.\n" +
                    "2. Update an existing enrolment.\n" +
                    "3. Delete an enrolment.\n" +
                    "4. Display and export a single enrolment.\n" +
                    "5. Display and export multiple enrolment.\n" +
                    "6. Display the current list of students, courses or enrollment.\n" +
                    "--------------------------------------------------------------------------------------");

            boolean selectorCheck = true;

            while (selectorCheck) {
                //Input screening
                try {
                    System.out.print("Enter your selection here(1, 2, 3, 4, 5 or 6): ");
                    input = reportSelectorInput.nextByte();
                    if (input >= 1 && input <= 6) {
                        selectorCheck = false;
                    } else {
                        System.out.println("Please enter only 1, 2, 3, 4, 5 or 6");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Please enter only 1, 2, 3, 4, 5 or 6");
                    reportSelectorInput.next();
                }
            }

            switch (input) {
                case 1:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 1...");
                    System.out.println();// For aesthetic purpose only
                    StudentEnrolmentManager.addEnrol(enrolList,courseList,studentList,semesterList);
                    endProgramCheck = endProgram();
                    break;

                case 2:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 2...");
                    System.out.println();// For aesthetic purpose only
                    StudentEnrolmentManager.updateEnrol(enrolList,courseList,studentList,semesterList);
                    endProgramCheck = endProgram();
                    break;

                case 3:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 3...");
                    System.out.println();// For aesthetic purpose only
                    StudentEnrolmentManager.deleteEnrol(enrolList,courseList,studentList);
                    endProgramCheck = endProgram();
                    break;
                case 4:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 4...");
                    System.out.println();// For aesthetic purpose only
                    try {StudentEnrolmentManager.getOne(enrolList,courseList,studentList); }
                    catch (FileNotFoundException ignored) {
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    endProgramCheck = endProgram();
                    break;
                case 5:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 5...");
                    System.out.println();// For aesthetic purpose only
                    try {StudentEnrolmentManager.getAll(enrolList,courseList,studentList,semesterList);}
                    catch (FileNotFoundException ignored) {
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    endProgramCheck = endProgram();
                    break;
                case 6:
                    System.out.println();// For aesthetic purpose only
                    System.out.println("Displaying interaction 6...");
                    System.out.println();// For aesthetic purpose only
                    displayList(enrolList,courseList,studentList);
                    System.out.println("--------------------------------------------------------------------------------------");
                    break;
            }
        }

    }
}
