package ____AP_Assignments______.Assignment__2;

import java.util.*;

public class Instructor implements User {

    static HashMap<String, String> inst = new HashMap<>();

    static HashMap<String, String> assessment = new HashMap<>();
    static HashMap<String, String> lecture = new HashMap<>();
    static HashMap<String, String> comments = new HashMap<>();

    static Scanner sc = new Scanner(System.in);
    static Instructor ins = new Instructor();

    private String ID;
    static String uploadedBy;

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
        inst.put("I" + this.ID, this.ID);
    }

    static class addLectureMaterial {
        String videoTopic = "";
        String videoName = "";
        String slidesTopic = "";
        String nofSlides;

        public void addLectureVideo() {
            System.out.print("Enter Topic of Video: ");
            this.videoTopic = sc.nextLine();
            System.out.print("Enter filename of Video:  ");
            this.videoName = sc.nextLine();

            lecture.put(ins.ID + " video Topic ", videoTopic);
            lecture.put(ins.ID + " video Name ", videoName);
            lecture.put("uploaded by", ins.ID);
            ins.uploadTime();

        }

        public void addLectureSlides() {
            System.out.print(" Enter Topic of Slides: ");
            this.slidesTopic = sc.nextLine();
            System.out.print(" Enter no of Slides: ");
            this.nofSlides = sc.nextLine();

            lecture.put(ins.ID + " Topic Slide ", slidesTopic);
            lecture.put(ins.ID + " Number of Slide ", nofSlides);

            for (int i = 1; i <= Integer.parseInt(nofSlides); i++) {
                System.out.print(" Content of Slide " + i + " : ");
                String content = sc.nextLine();
                lecture.put(ins.ID + " content of slide " + i, content);

            }
            lecture.put("uploaded by", ins.ID);
            ins.uploadTime();

        }

    }

    static class addAssessments {

        String probStatement = "";
        String marks = "";
        String quizQuestion = "";
        int quizMarks = 1;

        void addAssignments() {
            System.out.print("Enter Assignment Problem Statement: ");
            this.probStatement = sc.nextLine();
            System.out.print("\n Enter max marks: ");
            marks = sc.nextLine();

            assessment.put(ins.ID + " assignment max marks", marks);

            assessment.put(ins.ID + " assignment Problem ", probStatement);
            assessment.put("uploaded by", ins.ID);
            ins.uploadTime();

        }

        void addQuizes() {
            System.out.print("\nEnter Quiz Question:  ");
            this.quizQuestion = sc.nextLine();
            assessment.put(ins.ID + " Quiz Question ", probStatement);
            assessment.put("uploaded by", ins.ID);
            ins.uploadTime();
        }

    }

    void gradeAssessments() {

    }

    void closeAssignments() {
        String quizQuestion = sc.nextLine();
        assessment.remove(ins.ID + quizQuestion);
        System.out.println("\n Deadline ended....");
        System.out.print("Assignment closed...");

    }

    @Override
    public void addComments() {
        System.out.print("Enter Comment: ");
        String comment = sc.nextLine();
        System.out.print("      " + uploadTime());

        comments.put(ins.ID + " comment ", comment + "    " + uploadTime());

    }

    @Override
    public void viewComments() {
        comments.entrySet();
    }

    @Override
    public void login(String ID) {

        if (inst.containsValue(ID))
            System.out.print("Welcome " + "I" + ID);

        else
            System.out.print("Wrong choice.....Try Again");
        __BackPack__.selectRole();

    }

    @Override
    public void logout() {
        while (true) {
            break;
        }
    }

    @Override
    public void viewAssessments() {
        assessment.entrySet();

    }

    @Override
    public void viewLectureMaterial() {
        lecture.entrySet();
    }

}
