package com.mycompany.universityregistrationsystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UniversityRegistrationSystem {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("       UNIVERSITY REGISTRATION SYSTEM");
        System.out.println("==============================================");

        //1D Array
        //A one-dimensional array is used to store the university days.
        //Since the number of days in the academic week is fixed, 
        //an array is a suitable choice because it provides a simple and efficient 
        //way to store and access a fixed number of values using their indexes.
        String[] universityDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        System.out.println("\n--- University Days ---");

        for (String day : universityDays) {
            System.out.println(day);
        }
        //Access 
        System.out.println("\n--- Access Day ---");
        System.out.println("Day at index 2: " + universityDays[2]);

        //Search 
        System.out.println("\n--- Search Day ---");
        String searchDay = "Monday";
        boolean dayFound = false;
        for (String day : universityDays) {
            if (day.equals(searchDay)) {
                dayFound = true;
                break;
            }
        }
        if (dayFound) {
            System.out.println(searchDay + " was found.");
        } else {
            System.out.println(searchDay + " was not found.");
        }

        //Modify  
        System.out.println("\n--- Modify Day ---");
        universityDays[5] = "Friday";
        System.out.println("Day at index 5 after modification: " + universityDays[5]);

        //2D Array
        //A two-dimensional array is used to represent the weekly class schedule.
        //Each row contains related information: the day and the course scheduled for that day.
        //This structure is suitable because it allows related data to be organized in rows and columns,
        //making the schedule easy to access and display.
        String[][] classSchedule = {{"Saturday", "Java Programming"}, {"Sunday", "Software Testing"}, {"Monday", "Data Structures"}, {"Tuesday", "Database Systems"}, {"Wednesday", "Web Development"}, {"Thursday", "Computer Networks"}};
        System.out.println("\n--- Weekly Class Schedule ---");

        for (int i = 0; i < classSchedule.length; i++) {

            System.out.println(classSchedule[i][0] + " : " + classSchedule[i][1]);
        }

        //Access
        System.out.println("\n--- Access Schedule ---");
        System.out.println("Course on Monday: " + classSchedule[2][1]);

        //Search
        System.out.println("\n--- Search Course ---");
        String searchCourse = "Database Systems";
        boolean courseFound = false;
        for (int i = 0; i < classSchedule.length; i++) {
            if (classSchedule[i][1].equals(searchCourse)) {
                System.out.println(searchCourse + " was found on " + classSchedule[i][0]);
                courseFound = true;
                break;
            }
        }
        if (!courseFound) {
            System.out.println(searchCourse + " was not found.");
        }

        //Modify
        System.out.println("\n--- Modify Schedule ---");
        classSchedule[5][1] = "Artificial Intelligence";
        System.out.println("Thursday course after modification: " + classSchedule[5][1]);

        //List
        //A List is used to store the available courses.
        //It is suitable because courses are maintained in an ordered collection,
        //and the list can be easily accessed, searched, and modified when needed.
        List<String> courses = new ArrayList<>();
        courses.add("Java Programming");
        courses.add("Software Testing");
        courses.add("Data Structures");
        courses.add("Database Systems");
        courses.add("Web Development");
        courses.add("Computer Networks");
        System.out.println("\n--- Available Courses ---");

        //Display
        for (String course : courses) {
            System.out.println(course);
        }

        //Access
        System.out.println("\n--- Access Course ---");
        System.out.println("Course at index 1: " + courses.get(1));

        //Search 
        System.out.println("\n--- Search Course ---");
        if (courses.contains("Software Testing")) {
            System.out.println("Software Testing was found.");
        } else {
            System.out.println("Software Testing was not found.");
        }

        //Modify
        System.out.println("\n--- Modify Course ---");
        courses.set(5, "Artificial Intelligence");
        System.out.println("Course at index 5 after modification: " + courses.get(5));

        //ArrayList
        //An ArrayList is used to store registered students. 
        //It is appropriate because the number of registered students can change over time. 
        //Students can be easily added, removed, searched for, or accessed by index while maintaining their order.
        ArrayList<String> students = new ArrayList<>();
        students.add("Mahmoud");
        students.add("Mohamed");
        students.add("Ahmed");
        students.add("Ali");
        students.add("Khaleed");
        System.out.println("\n--- Registered Students ---");

        //Display
        for (String student : students) {
            System.out.println(student);
        }

        //Access
        System.out.println("\n--- Access Student ---");

        System.out.println("Student at index 2: " + students.get(2));

        //Search
        System.out.println("\n--- Search Student ---");

        if (students.contains("Ahmed")) {
            System.out.println("Ahmed was found in the registered students.");
        } else {
            System.out.println("Ahmed was not found.");
        }

        //Modify
        System.out.println("\n--- Modify Student ---");

        students.set(4, "Nader");

        System.out.println("Student at index 4 after modification: " + students.get(4));

        //LinkedList
        //A LinkedList is used to manage the student waiting list.
        //It is suitable for this purpose because students may frequently join or leave the waiting list,
        //and the structure supports adding and removing elements efficiently while preserving their order. 
        LinkedList<String> waitingList = new LinkedList<>();
        waitingList.add("Fady");
        waitingList.add("Amr");
        waitingList.add("Hassan");
        waitingList.add("Hashim");
        System.out.println("\n--- Waiting List ---");

        //Display
        for (String student : waitingList) {
            System.out.println(student);
        }

        //Access
        System.out.println("\n--- Access Waiting Student ---");

        System.out.println("First student in waiting list: " + waitingList.getFirst());

        //Search
        System.out.println("\n--- Search Waiting Student ---");

        if (waitingList.contains("Hassan")) {
            System.out.println("Hassan was found in the waiting list.");
        } else {
            System.out.println("Hassan was not found.");
        }

        //Modify
        System.out.println("\n--- Modify Waiting Student ---");

        waitingList.set(2, "Karim");

        System.out.println("Student at index 2 after modification: " + waitingList.get(2));

        //Set
        //A Set is used to store university departments.
        //A department should not appear more than once, 
        //so a Set is an appropriate choice because it automatically prevents duplicate values.
        Set<String> departments = new HashSet<>();
        departments.add("Computer Science");
        departments.add("Information Technology");
        departments.add("Software Engineering");
        departments.add("Information Systems");
        departments.add("Computer Science");
        System.out.println("\n--- University Departments ---");

        //Display
        for (String department : departments) {
            System.out.println(department);
        }

        //Search
        System.out.println("\n--- Search Department ---");
        if (departments.contains("Computer Science")) {
            System.out.println("Computer Science was found.");
        } else {

            System.out.println("Computer Science was not found.");
        }

        //Modify 
        System.out.println("\n--- Modify Department ---");
        departments.remove("Information Systems");
        departments.add("Artificial Intelligence");
        System.out.println("Departments after modification:");
        for (String department : departments) {
            System.out.println(department);
        }

        //HashSet
        //A HashSet is used to store student IDs.
        //Each student ID must be unique, and HashSet automatically prevents duplicate IDs. 
        //It also provides efficient searching for an ID using methods such as contains().
        HashSet<Integer> studentIds = new HashSet<>();
        studentIds.add(1001);
        studentIds.add(1002);
        studentIds.add(1003);
        studentIds.add(1004);
        studentIds.add(1001);
        System.out.println("\n--- Student IDs ---");

        //Display
        for (int studentId : studentIds) {
            System.out.println(studentId);
        }

        //Search
        System.out.println("\n--- Search Student ID ---");
        if (studentIds.contains(1003)) {
            System.out.println("Student ID 1003 was found.");
        } else {
            System.out.println("Student ID 1003 was not found.");
        }

        //Modify 
        System.out.println("\n--- Modify Student ID ---");
        studentIds.remove(1004);
        studentIds.add(1005);
        System.out.println("Student IDs after modification:");
        for (int studentId : studentIds) {
            System.out.println(studentId);
        }

        //HashMap
        //A HashMap is used to associate each student ID with the corresponding student name.
        //The student ID is used as the key and the student's name as the value.
        //This makes it easy to quickly access, search, and update student information using the ID.
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1001, "Mahmoud");
        studentMap.put(1002, "Mohamed");
        studentMap.put(1003, "Ahmed");
        studentMap.put(1004, "Ali");
        System.out.println("\n--- Student Information ---");

        for (Integer studentId : studentMap.keySet()) {
            System.out.println(
                    "Student ID: " + studentId + " | Name: " + studentMap.get(studentId)
            );
        }

        //Access
        System.out.println("\n--- Access Student ---");

        String studentName = studentMap.get(1002);

        System.out.println("Student with ID 1002: " + studentName);

        //Search
        System.out.println("\n--- Search Student ---");

        if (studentMap.containsKey(1003)) {
            System.out.println("Student ID 1003 was found.");
        } else {
            System.out.println("Student ID 1003 was not found.");
        }

        //Modify
        System.out.println("\n--- Modify Student ---");

        System.out.println("Before modification: " + studentMap.get(1004));

        studentMap.put(1004, "Nader");

        System.out.println("After modification: " + studentMap.get(1004));
    }
}


