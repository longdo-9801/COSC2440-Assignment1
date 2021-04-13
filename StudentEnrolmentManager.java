package Assignment1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public interface StudentEnrolmentManager {
    static void addEnrol(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList, String[] semesterList) {
        boolean checker = false;
        Student inputStudent = null;
        Course inputCourse = null;
        while (!checker) {
            Student testStudent = checkStudent(studentList);
            Course testCourse = checkCourse(courseList);
            if (enrolList.size() <= 0) {
                checker = true;
                inputCourse = testCourse;
                inputStudent = testStudent;
            } else {
                for (int i = 0; i < enrolList.size(); i++) {
                    if (enrolList.get(i).getStudents().getsID().equalsIgnoreCase(testStudent.getsID()) && enrolList.get(i).getCourses().getcID().equalsIgnoreCase(testCourse.getcID())) {
                        System.out.println("Student already enrolled in this course.");
                        break;
                    } else if (i == (enrolList.size() - 1)) {
                        checker = true;
                        inputCourse = testCourse;
                        inputStudent = testStudent;
                    }
                }
            }
        }
        String inputSemester = checkSemester(semesterList);

        enrolList.add(new StudentEnrolment(inputSemester, inputStudent, inputCourse));
        System.out.println("Added enrol:" + (enrolList.get(enrolList.size()-1)).toString());
        System.out.println(enrolList.toString());
    }

    static void updateEnrol(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList, String[] semesterList) {
        System.out.println("Please enter the necessary data.");
        int enrolIndex = singleEnrollmentQuery(enrolList,courseList,studentList);
        System.out.println(enrolList.get(enrolIndex));
        Scanner reportSelectorInput = new Scanner(System.in);
        byte input = 0;
        System.out.println("Please select how you wish modify the enrolments\n" +
                "1. To change student.\n" +
                "2. To change course.\n" +
                "3. To change semester.\n" +
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
        switch (input) {
            case 1:
                Student newStudent = checkStudent(studentList);
                enrolList.get(enrolIndex).setStudents(newStudent);
                break;
            case 2:
                Course newCourse = checkCourse(courseList);
                enrolList.get(enrolIndex).setCourses(newCourse);
                break;
            case 3:
                String newSemester = checkSemester(semesterList);
                enrolList.get(enrolIndex).setSemester(newSemester);
                break;
        }


    }

    static void deleteEnrol(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList) {
        System.out.println("Please enter the necessary data.");
        int enrolIndex = singleEnrollmentQuery(enrolList,courseList,studentList);
        System.out.println(enrolList.get(enrolIndex));
        System.out.println("Do you want to delete this enrollment(Y/N):");
        Scanner ynScanner = new Scanner(System.in);
        String input = ynScanner.nextLine();
        if (input.equalsIgnoreCase(String.valueOf('y'))) {
            enrolList.remove(enrolIndex);
        } else if (input.equalsIgnoreCase(String.valueOf('n'))) {
            System.out.println("Removal cancelled");
        } else {
            System.out.println("Please input only y or n.");
        }

    }

    static void getOne(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList) throws IOException {
        StudentEnrolment enrolQuery = enrolList.get(singleEnrollmentQuery(enrolList,courseList,studentList));
        System.out.println(enrolQuery);
        System.out.println("Do you wish to output the result to a file(Y/N):");
        Scanner ynScanner = new Scanner(System.in);
        String input = ynScanner.nextLine();
        if (input.equalsIgnoreCase(String.valueOf('y'))) {
            FileWriter writer = new FileWriter("output_report.csv");
            writer.write(enrolQuery.toCSV()+"\n");
            writer.close();
        } else if (input.equalsIgnoreCase(String.valueOf('n'))) {
            System.out.println("Function end...");
        } else {
            System.out.println("Please input only y or n.");
        }

    }

    static void getAll(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList, String[] semesterList) throws IOException {
        ArrayList<StudentEnrolment> enrolQuery = new ArrayList<>(multiEnrollmentQuery(enrolList, courseList, studentList, semesterList));
        System.out.println("Do you wish to output the result to a file(Y/N):");
        Scanner ynScanner = new Scanner(System.in);
        String input = ynScanner.nextLine();
        if (input.equalsIgnoreCase(String.valueOf('y'))) {
            FileWriter writer = new FileWriter("output_report.csv");
            for (StudentEnrolment enrolPointer : enrolQuery) {
                writer.write(enrolPointer.toCSV()+"\n");
            }
            writer.close();
        } else if (input.equalsIgnoreCase(String.valueOf('n'))) {
            System.out.println("Function end...");
        } else {
            System.out.println("Please input only y or n.");
        }

    }

    static Student checkStudent(ArrayList<Student> studentList) {
        Scanner inputer = new Scanner(System.in);
        while (true) { //Input Screening
            System.out.println("Please enter the student id of the student you wish to enroll(ex. S0000000): ");
            String sIDInput = inputer.nextLine();
            for (Student studentPointer : studentList) {
                if ((studentPointer.getsID()).equalsIgnoreCase(sIDInput)) {
                    System.out.println("Student id confirmed");
                    System.out.println("Retrieving student info...");
                    System.out.println(studentPointer.toString());
                    return studentPointer;
                }
            }
            System.out.println("The student ID is wrong, please enter correct ID");


        }
    }

    static Course checkCourse(ArrayList<Course> courseList) {
        Scanner inputer = new Scanner(System.in);
        while (true) { //Input Screening
            System.out.println("Please enter the course id of the course you wish to enroll(ex. ATM005): ");
            String cIDInput = inputer.nextLine();
            for (Course coursePointer : courseList) { //Check for ID in Student List, no checking for misspelling
                if ((coursePointer.getcID()).equalsIgnoreCase(cIDInput)) {
                    System.out.println("Course id confirmed");
                    System.out.println("Retrieving course info...");
                    System.out.println(coursePointer.toString());
                    return coursePointer;
                }
            }
            System.out.println("The course ID is wrong, please enter correct ID");
        }
    }
    static String checkSemester(String[] semesterList) {
        Scanner inputer = new Scanner(System.in);
        while (true) { //Input Screening
            System.out.println("Please enter desired the semester(ex. 2020A, 2021C or 2020): ");
            String semesterInput = inputer.nextLine();
            for (String semPointer : semesterList) { //Check for ID in Semester List, limited to 2020B-2021A for simplicity
                if ((semPointer).equalsIgnoreCase(semesterInput)) {
                    System.out.println("Semester ["+ semPointer + "] confirmed");
                    return semesterInput;
                }
            }
            System.out.println("The semester is wrong, please enter correct semester");

        }
    }

    static ArrayList<StudentEnrolment> multiEnrollmentQuery(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList, String[] semesterList) {
        Scanner reportSelectorInput = new Scanner(System.in);
        byte input = 0;
        ArrayList<StudentEnrolment> masterQuery = new ArrayList<>();
        System.out.println("Please select how you wish to find the enrolments\n" +
                "1. Print all courses for 1 student in 1 semester.\n" +
                "2. Print all students of 1 course in 1 semester.\n" +
                "3. Prints all courses offered in 1 semester.\n" +
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
        ArrayList<StudentEnrolment> tempArray = new ArrayList<>();
        switch (input) {
            case 1:
                tempArray.addAll(queryStudent(enrolList,studentList));
                if (tempArray.size() == 0) {
                    System.out.println("No enrollment was found.");
                } else {
                    masterQuery.addAll(querySemester(tempArray,semesterList));
                    for (StudentEnrolment enrolPointer : masterQuery) {
                        System.out.println(enrolPointer.toString());
                    }
                }
                break;
            case 2:
                tempArray.addAll(queryCourse(enrolList,courseList));
                if (tempArray.size() == 0) {
                    System.out.println("No enrollment was found.");
                } else {
                    masterQuery.addAll(querySemester(tempArray,semesterList));
                    for (StudentEnrolment enrolPointer : masterQuery) {
                        System.out.println(enrolPointer.toString());
                    }
                }
                break;
            case 3:
                masterQuery.addAll(querySemester(enrolList,semesterList));
                for (StudentEnrolment enrolPointer : masterQuery) {
                    System.out.println(enrolPointer.getCourses().toString());
                }
                break;
        }
        return masterQuery;
    }

    static int singleEnrollmentQuery(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList, ArrayList<Student> studentList) {
        boolean checker = false;
        int queryResult = -1;
        while (!checker) {
            Student testStudent = checkStudent(studentList);
            Course testCourse = checkCourse(courseList);
            if (enrolList.size() <= 0) {
                checker = true;
                System.out.println("Enrollment list is empty");
            } else {
                for (int i = 0; i < enrolList.size(); i++) {
                    if (enrolList.get(i).getStudents().getsID().equalsIgnoreCase(testStudent.getsID()) && enrolList.get(i).getCourses().getcID().equalsIgnoreCase(testCourse.getcID())) {
                        System.out.println("Enrollment found.");
                        queryResult = i;
                        checker = true;
                        break;
                    } else if (i == (enrolList.size() - 1)) {
                        System.out.println("Enrollment not found.");
                        checker = true;

                    }
                }
            }
        }

        return queryResult;
    }

    static ArrayList<StudentEnrolment> queryStudent(ArrayList<StudentEnrolment> enrolList, ArrayList<Student> studentList) {
        ArrayList<StudentEnrolment> studentQuery = new ArrayList<>();
        Student chosenStudent = checkStudent(studentList);
        for (StudentEnrolment enrolPointer : enrolList)
            if ((chosenStudent.getsID()).equalsIgnoreCase(enrolPointer.getStudents().getsID())) {
                studentQuery.add(enrolPointer);
            }
        return studentQuery;
    }

    static ArrayList<StudentEnrolment> queryCourse(ArrayList<StudentEnrolment> enrolList, ArrayList<Course> courseList) {
        ArrayList<StudentEnrolment> courseQuery = new ArrayList<>();
        Course chosenCourse = checkCourse(courseList);
        for (StudentEnrolment enrolPointer : enrolList)
            if ((chosenCourse.getcID()).equalsIgnoreCase(enrolPointer.getCourses().getcID())) {
                courseQuery.add(enrolPointer);
            }
        return courseQuery;
    }

    static ArrayList<StudentEnrolment> querySemester(ArrayList<StudentEnrolment> enrolList, String[] semesterList) {
        ArrayList<StudentEnrolment> semesterQuery = new ArrayList<>();
        String chosenSemester = checkSemester(semesterList);
        for (StudentEnrolment enrolPointer : enrolList)
            if (chosenSemester.equalsIgnoreCase(enrolPointer.getSemester())) {
                semesterQuery.add(enrolPointer);
            }
        if (semesterQuery.size() == 0) {
            System.out.println("No enrollment found");
        }
        return semesterQuery;
    }



}
