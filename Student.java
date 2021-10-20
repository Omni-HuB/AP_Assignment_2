package ____AP_Assignments______.Assignment__2;

import java.util.*;

public class Student implements User {

    static HashMap<String, String> student = new HashMap<>();
    static HashMap<String, String> grades = new HashMap<>();
    static HashMap<String, String> subass = new HashMap<>();

    void submitAssessments() {
        stu.viewAssessments();
        String assName;
        String assessmentID;
        System.out.println();
        System.out.print("\nEnter ID of Assessment :");
        assessmentID = sc.nextLine();
        System.out.print("Enter Assessment name: ");
        assName = sc.nextLine() + "_" + StudentMenu.ID + ".zip";
        subass.put(assName + " ", assessmentID);

    }

    void viewGrades() {

    }

    static Scanner sc = new Scanner(System.in);
    static Student stu = new Student();

    String ID;

    @Override
    public Date uploadTime() {

        java.util.Date uploadTime = new java.util.Date();

        return uploadTime;

    }

    static {

        System.out.print("choose ID: ");
        stu.ID = sc.nextLine();

        String stu0, stu1, stu2;
        stu0 = "S0";
        stu1 = "S1";
        stu2 = "S2";

        student.put(stu0, "0");
        student.put(stu1, "1");
        student.put(stu2, "2");

    }

    @Override
    public void addComments() {
        System.out.print("Enter Comment: ");
        String comment = sc.nextLine();
        System.out.print("      " + uploadTime());

        Instructor.comments.put(StudentMenu.ID + " comment ", comment + "    " + uploadTime());

    }

    @Override
    public void viewComments() {
        System.out.print(Instructor.comments.entrySet());
    }

    @Override
    public void login(String ID) {

        if (student.containsValue(ID))
            System.out.print("Welcome " + "S" + ID);

        else
            System.out.print("Wrong choice.....Try Again");

    }

    @Override
    public void logout() {
        System.out.println("logging out.........");
    }

    @Override
    public void viewAssessments() {
        System.out.println(Instructor.assessment.entrySet());

    }

    @Override
    public void viewLectureMaterial() {
        System.out.println(Instructor.lecture.entrySet());
    }

}
