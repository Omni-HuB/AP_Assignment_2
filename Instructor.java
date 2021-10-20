package ____AP_Assignments______.Assignment__2;

import java.util.*;

public class Instructor implements User {

    static HashMap<String, String> inst = new HashMap<>();

    static HashMap<String, String> assessment = new HashMap<>();
    static HashMap<String, String> lecture = new HashMap<>();
    static HashMap<String, String> comments = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static Instructor ins = new Instructor();

    static String uploadedBy;

    @Override
    public Date uploadTime() {

        java.util.Date uploadTime = new java.util.Date();

        return uploadTime;

    }

    static {

        // System.out.print("choose ID: ");
        // ins.ID = sc.nextLine();

        String ins0, ins1;
        ins0 = "I0";
        ins1 = "I1";

        inst.put(ins0, "0");
        inst.put(ins1, "1");

    }

    static class addLectureMaterial {
        String videoTopic = "";
        String videoName = "";
        String slidesTopic = "";
        String nofSlides;

        public void addLectureVideo() {
            System.out.print("\nEnter Topic of Video: ");
            this.videoTopic = sc.nextLine();
            System.out.print("\nEnter filename of Video:  ");
            this.videoName = sc.nextLine() + ".mp4";

            lecture.put(InstructorMenu.ID + " video Topic ", videoTopic);
            lecture.put(InstructorMenu.ID + " video Name ", videoName);
            lecture.put(" uploaded by", InstructorMenu.ID);
            ins.uploadTime();

        }

        public void addLectureSlides() {
            System.out.print(" \nEnter Topic of Slides: ");
            this.slidesTopic = sc.nextLine();
            System.out.print("\n Enter no of Slides: ");
            this.nofSlides = sc.nextLine();

            lecture.put(InstructorMenu.ID + " Topic Slide ", slidesTopic);
            lecture.put(InstructorMenu.ID + " Number of Slide ", nofSlides);

            for (int i = 1; i <= Integer.parseInt(nofSlides); i++) {
                System.out.print("\nContent of Slide " + i + " : ");
                String content = sc.nextLine();
                lecture.put(InstructorMenu.ID + " content of slide " + i, content);

            }
            lecture.put("uploaded by", InstructorMenu.ID);
            ins.uploadTime();

        }

    }

    static class addAssessments {

        String probStatement = "";
        String marks = "";
        String quizQuestion = "";
        int quizMarks = 1;

        void addAssignments() {
            System.out.print("\nEnter Assignment Problem Statement: ");
            this.probStatement = sc.nextLine();
            System.out.print("\n Enter max marks: ");
            marks = sc.nextLine();

            assessment.put(InstructorMenu.ID + " assignment max marks", marks);

            assessment.put(InstructorMenu.ID + " assignment Problem ", probStatement);
            assessment.put("uploaded by", InstructorMenu.ID);
            ins.uploadTime();

        }

        void addQuizes() {
            System.out.print("\nEnter Quiz Question:  ");
            this.quizQuestion = sc.nextLine();
            assessment.put(InstructorMenu.ID + " Quiz Question ", probStatement);
            assessment.put("uploaded by", InstructorMenu.ID);
            ins.uploadTime();
        }

    }

    void gradeAssessments() {

    }

    void closeAssignments() {
        String quizQuestion = sc.nextLine();
        assessment.remove(InstructorMenu.ID + quizQuestion);
        System.out.println("\n Deadline ended....");
        System.out.print("Assignment closed...");

    }

    @Override
    public void addComments() {
        System.out.print("\nEnter Comment: ");
        String comment = sc.nextLine();
        System.out.println("      " + uploadTime());

        comments.put(InstructorMenu.ID + " comment ", comment + "    " + uploadTime());

    }

    @Override
    public void viewComments() {
        System.out.print(comments.entrySet());
    }

    @Override
    public void login(String ID) {

        if (inst.containsValue(ID)) {
            System.out.println("Welcome " + "I" + ID);

            // else
            // System.out.print("Wrong choice.....Try Again");
        }

    }

    @Override
    public void logout() {
        System.out.println("logging out.........");

    }

    @Override
    public void viewAssessments() {
        System.out.println(assessment.entrySet());

    }

    @Override
    public void viewLectureMaterial() {
        System.out.println(lecture.entrySet());
    }

}
