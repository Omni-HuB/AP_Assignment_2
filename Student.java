package ____AP_Assignments______.Assignment__2;

import java.util.*;

public class Student implements User {

    static HashMap<String, String> student = new HashMap<>();
    static HashMap<String, String> grades = new HashMap<>();
    static HashMap<String, String> subass = new HashMap<>();

    void submitAssessments() {

    }

    void viewGrades() {

    }

    static Scanner sc = new Scanner(System.in);
    static Student stu = new Student();;

    private String ID;

    @Override
    public Date uploadTime() {

        java.util.Date uploadTime = new java.util.Date();

        return uploadTime;

    }

    public String getID() {
        return ID;

    }

    public void setID(String ID) {

        System.out.print("choose ID: ");
        this.ID = sc.nextLine();
        this.ID = ID;
        student.put("S" + this.ID, this.ID);
    }

    @Override
    public void addComments() {
        System.out.print("Enter Comment: ");
        String comment = sc.nextLine();
        System.out.print("      " + uploadTime());

        Instructor.comments.put(stu.ID + " comment ", comment + "    " + uploadTime());

    }

    @Override
    public void viewComments() {
        Instructor.comments.entrySet();
    }

    @Override
    public void login(String ID) {

        if (student.containsValue(ID))
            System.out.print("Welcome " + "S" + ID);

        else
            System.out.print("Wrong choice.....Try Again");
        backPack.selectRole();

    }

    @Override
    public void logout() {
        while (true) {
            break;
        }
    }

    @Override
    public void viewAssessments() {
        Instructor.assessment.entrySet();

    }

    @Override
    public void viewLectureMaterial() {
        Instructor.lecture.entrySet();
    }

}
