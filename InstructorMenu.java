package ____AP_Assignments______.Assignment__2;

import java.util.Scanner;

import ____AP_Assignments______.Assignment__2.Instructor.addAssessments;
import ____AP_Assignments______.Assignment__2.Instructor.addLectureMaterial;

public class InstructorMenu {

    static Scanner sc = new Scanner(System.in);
    static Instructor ins = new Instructor();
    static addLectureMaterial material = new addLectureMaterial();
    static addAssessments assessments = new addAssessments();

    static void instructorMenu() {

        System.out.println("""
                .............INSTRUCTOR MENU............

                           1. Add Lecture material
                           2. Add assessments
                           3. View lecture materials
                           4. View assessments
                           5. Grade assessments
                           6. Close assessment
                           7. View comments
                           8. Add comments
                           9. Logout""");

        int selInsMenu = sc.nextInt();
        switch (selInsMenu) {

            case 1:
                // add lectur materials

                System.out.println("1.Lecture Slides ");
                System.out.println("2.Lecture Videos ");

                System.out.print("which material you want to add:");
                int m = sc.nextInt();
                System.out.println();
                switch (m) {
                    case 1:
                        material.addLectureSlides();
                        break;
                    case 2:
                        material.addLectureVideo();
                        break;

                }
                break;

            case 2:

                // add Assessments

                System.out.println("1. Add Assignments  ");
                System.out.println("2.Add Quizzes  ");

                System.out.print("which material you want to add:");
                m = sc.nextInt();
                System.out.println();
                switch (m) {
                    case 1:
                        assessments.addAssignments();

                        break;

                    case 2:
                        assessments.addQuizes();

                        break;

                }
                break;

            case 3:
                // view Assessments
                ins.viewAssessments();

                break;

            case 4:
                // view Lectures
                ins.viewLectureMaterial();

                break;

            case 5:
                // Grade assessments
                ins.gradeAssessments();
                break;

            case 6:
                // Close assessment
                ins.closeAssignments();
                break;

            case 7:
                // View comments
                ins.viewComments();
                break;

            case 8:
                // Add comments
                ins.addComments();
                break;

            case 9:
                // Logout
                ins.logout();
                break;

        }
    }

    public static void main(String[] args) {

        String selectInsID = ins.getID();
    }
}
