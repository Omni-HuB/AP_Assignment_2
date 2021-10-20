package ____AP_Assignments______.Assignment__2;

import java.util.*;

public class StudentMenu {

    static Scanner sc = new Scanner(System.in);
    static Student stu = new Student();

    static String ID;

    static void studentMenu() {

        System.out.println("""
                .............STUDENTS MENU............

                           1. View lecture materials
                           2. View assessments
                           3. Submit assessments
                           4. View grades
                           5. View comments
                           6. Add comments
                           7. Logout""");

        int selStuMenu = sc.nextInt();
        switch (selStuMenu) {

        case 1:
            // view Assessments
            stu.viewAssessments();

            break;

        case 2:
            // view Lectures
            stu.viewLectureMaterial();

            break;

        case 3:
            // Grade assessments
            stu.submitAssessments();
            break;

        case 4:
            // Close assessment
            stu.viewGrades();
            break;

        case 5:
            // View comments
            stu.viewComments();
            break;

        case 6:
            // Add comments
            stu.addComments();
            break;

        case 9:
            // Logout
            stu.logout();
            break;
        }

    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("""
                    0-S0
                    1-S1
                    2-S2
                """);

        System.out.println("choose id: ");
        String chooseID = sc.nextLine();
        stu.login(chooseID);
        ID = "S" + chooseID;
        int selectStuID = Integer.parseInt(chooseID);
        label: while (true) {
            switch (selectStuID) {

            case 0:
                studentMenu();
                break label;

            case 1:
                studentMenu();
                break label;

            case 2:
                studentMenu();
                break label;

            }
        }

    }
}
