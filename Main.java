package Assignment1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {//implements StudentEnrolmentManager {
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


    //AA    // Code for addEnrol!!!!!!
        Scanner inputer = new Scanner(System.in);
        boolean foundItem = false;
//        Student inputStudent = null;
//        while (!foundItem) { //Input Screening
//            System.out.println("Please enter the student id of the student you wish to enroll(ex. S0000000): ");
//            String sIDInput = inputer.nextLine();
//            //int counter = 1; // For checking number of loop
//            for (Student studentPointer : studentList) { //Check for ID in Student List, no checking for misspelling
//                //System.out.println("Loop no. " + counter); //Checking if loop can go through list
//                //counter++;
//                if ((studentPointer.getsID()).equalsIgnoreCase(sIDInput)) {
//                    foundItem = true;
//                    System.out.println("Student id confirmed");
//                    System.out.println("Retrieving student info...");
//                    inputStudent = studentPointer;
//                    System.out.println(inputStudent.toString());
//                    break;
//                }
//            }
//            if (!foundItem) {
//                System.out.println("The student ID is wrong, please enter correct ID");
//            }
//
//        }
//        foundItem = false;
//        Course inputCourse = null;
//        while (!foundItem) { //Input Screening
//            System.out.println("Please enter the course id of the course you wish to enroll(ex. ATM005): ");
//            String cIDInput = inputer.nextLine();
//            //int counter = 1; // For checking number of loop
//            for (Course coursePointer : courseList) { //Check for ID in Student List, no checking for misspelling
//                //System.out.println("Loop no. " + counter); //Checking if loop can go through list
//                //counter++;
//                if ((coursePointer.getcID()).equalsIgnoreCase(cIDInput)) {
//                    foundItem = true;
//                    System.out.println("Course id confirmed");
//                    System.out.println("Retrieving course info...");
//                    inputCourse = coursePointer;
//                    System.out.println(inputCourse.toString());
//                    break;
//                }
//            }
//            if (!foundItem) {
//                System.out.println("The course ID is wrong, please enter correct ID");
//            }
//
//        }

        foundItem = false;
        while (!foundItem) { //Input Screening
            System.out.println("Please enter the targeted year (format yyyyA/yyyyB/yyyyC for semester 1/2/3 respectively): ");
            String semesterInput = inputer.nextLine();
            for (int i = 0; i < semesterInput.length(); i++) {
                if (semesterInput.length() > 5) {
                    break;
                }
                switch (i) {
                    case 1:
                        if (semesterInput.charAt(i) >= '0' && semesterInput.charAt(i) <= '9') {
                            break;
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }

                if (i == 5) {
                    if (semesterInput.charAt(i) == 'A' ||semesterInput.charAt(i) == 'B' ||semesterInput.charAt(i) == 'C');
                    foundItem = true;
                    break;
                }


            }
        }
        //enrolmentsArray.add(new StudentEnrolment(sIDInput, cIDInput, semesterInput));
        //enrolList.add(new StudentEnrolment(semesterInput, inputStudent, inputCourse));
        enrolList.add(new StudentEnrolment("2020A", studentList.get(0),courseList.get(0))); //Test input
        System.out.println("Added enrol:" + (enrolList.get(enrolList.size()-1)).toString());
        System.out.println(enrolList.toString());


    //BB // Code for updateEnrol
    //    for (int i = 0; i < enrolList.size(); i++) {
    //
    //    }
    //CC // Code for deleteEnrol
    //DD // Code for getOne
    //EE // Code for getAll





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

        //Interaction codes below this line
//        Scanner reportSelectorInput = new Scanner(System.in);
//        byte input = 0;
//
//        System.out.println("Welcome to \"Report and Statistic\"\n" +
//                "Please choose the report type you wish to view:\n" +
//                "1. Display a summary report that contains all number of leads by ages.\n" +
//                "2. Display a summary report that contains all number of interactions by potential within a date range.\n" +
//                "3. Display a summary report that contains all number of interactions by month within a date range.\n" +
//                "--------------------------------------------------------------------------------------");
//
//        boolean selectorCheck = true;
//
//        while (selectorCheck) {
//            //Input screening
//            try {
//                System.out.print("Enter your selection here(1, 2 or 3): ");
//                input = reportSelectorInput.nextByte();
//                selectorCheck = false;
//            } catch (InputMismatchException e) {
//                System.out.println("Please enter only 1, 2 or 3");
//                reportSelectorInput.next();
//            }
//        }
//
//        switch (input) {
//            case 1:
//                System.out.println();// For aesthetic purpose only
//                System.out.println("Displaying report type 1...");
//                System.out.println();// For aesthetic purpose only
//                try {StudentEnrolment.addEnrol(enrolList);} catch (FileNotFoundException ignored) {
//                }
//                break;
//
//            case 2:
//                System.out.println();// For aesthetic purpose only
//                System.out.println("Displaying report type 2...");
//                System.out.println();// For aesthetic purpose only
//                try {Report.potentialSum();} catch (FileNotFoundException ignored) {
//                }
//                break;
//
//            case 3:
//                System.out.println();// For aesthetic purpose only
//                System.out.println("Displaying report type 3...");
//                System.out.println();// For aesthetic purpose only
//                try {Report.interactionSum();} catch (FileNotFoundException ignored) {
//                }
//                break;
//        }









    }
}
