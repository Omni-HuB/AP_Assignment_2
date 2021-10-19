package ____AP_Assignments______.Assignment__2;

import java.util.*;

public class __BackPack__ {

    // static {

    // }

    static int selectRole;

    public static void selectRole() {
        System.out.print("Select your Role----");

        do {
            selectRole = sc.nextInt();
        } while (selectRole >= 1 || selectRole <= 3);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("............Welcome to BACK-PACK................");
        System.out.print("1.Enter as Instructor");
        System.out.print("2.Enter as Student");
        System.out.print("Exit");

        // for (int i=0;i<=instructorArray.size();i++){

        // }

        selectRole();
        if (1 <= selectRole || selectRole <= 3) {
            while (true) {
                switch (selectRole) {

                    case 1:

                    {
                        InstructorMenu.main(args);
                    }

                        break;

                    case 2:
                        StudentMenu.main(args);

                        break;

                    case 3:

                        break;

                }
            }
        }

    }
}
