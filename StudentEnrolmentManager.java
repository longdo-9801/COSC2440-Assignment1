package Assignment1;


import java.util.ArrayList;
import java.util.Scanner;

public interface StudentEnrolmentManager {
    public static void addEnrol(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList) {
        Scanner inputer = new Scanner(System.in);
        boolean foundItem = false;
        Student inputStudent = null;
        while (!foundItem) { //Input Screening
            System.out.println("Please enter the student id of the student you wish to enroll(ex. S0000000): ");
            String sIDInput = inputer.nextLine();
            //int counter = 1; // For checking number of loop
            for (Student studentPointer : studentList) { //Check for ID in Student List, no checking for misspelling
                //System.out.println("Loop no. " + counter); //Checking if loop can go through list
                //counter++;
                if ((studentPointer.getsID()).equalsIgnoreCase(sIDInput)) {
                    foundItem = true;
                    System.out.println("Student id confirmed");
                    System.out.println("Retrieving student info...");
                    inputStudent = studentPointer;
                    System.out.println(inputStudent.toString());
                    break;
                }
            }
            if (!foundItem) {
                System.out.println("The student ID is wrong, please enter correct ID");
            }

        }
        foundItem = false;
        Course inputCourse = null;
        while (!foundItem) { //Input Screening
            System.out.println("Please enter the course id of the course you wish to enroll(ex. ATM005): ");
            String cIDInput = inputer.nextLine();
            //int counter = 1; // For checking number of loop
            for (Course coursePointer : courseList) { //Check for ID in Student List, no checking for misspelling
                //System.out.println("Loop no. " + counter); //Checking if loop can go through list
                //counter++;
                if ((coursePointer.getcID()).equalsIgnoreCase(cIDInput)) {
                    foundItem = true;
                    System.out.println("Course id confirmed");
                    System.out.println("Retrieving course info...");
                    inputCourse = coursePointer;
                    System.out.println(inputCourse.toString());
                    break;
                }
            }
            if (!foundItem) {
                System.out.println("The course ID is wrong, please enter correct ID");
            }

        }

//        foundItem = false;
//        while (!foundItem) { //Input Screening
        System.out.println("Please enter the targeted year (format yyyyA/yyyyB/yyyyC for semester 1/2/3 respectively): ");
        String semesterInput = inputer.nextLine();
//            for (int i = 0; i < semesterInput.length(); i++) {
//                if (semesterInput.length() > 5) {
//                    break;
//                }
//                switch (i) {
//                    case 1:
//                        if (semesterInput.charAt(i) >= '0' && semesterInput.charAt(i) <= '9') {
//                            break;
//                        }
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        break;
//                }
//
//                if (i == 5) {
//                    if (semesterInput.charAt(i) == 'A' ||semesterInput.charAt(i) == 'B' ||semesterInput.charAt(i) == 'C');
//                    foundItem = true;
//                    break;
//                }
//
//
//            }
//        }

        enrolList.add(new StudentEnrolment(semesterInput, inputStudent, inputCourse));
//        enrolList.add(new StudentEnrolment("2020A", studentList.get(0),courseList.get(0))); //Test input
        System.out.println("Added enrol:" + (enrolList.get(enrolList.size()-1)).toString());
        System.out.println(enrolList.toString());
    }

    public static void updateEnrol(ArrayList<StudentEnrolment> enrolmentsArray, ArrayList<Course> courseArray, ArrayList<Student> studentArray) {
        return;
    }

    public static void deleteEnrol(ArrayList<StudentEnrolment> enrolmentsArray, ArrayList<Course> courseArray, ArrayList<Student> studentArray) {

    }

    public static void getOne(ArrayList<StudentEnrolment> enrolmentsArray, ArrayList<Course> courseArray, ArrayList<Student> studentArray) {

    };

    public static void getAll(ArrayList<StudentEnrolment> enrolmentsArray, ArrayList<Course> courseArray, ArrayList<Student> studentArray) {
        
    };

}
