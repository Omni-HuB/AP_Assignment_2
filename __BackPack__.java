package ____AP_Assignments______.Assignment__2;

import java.util.*;

public class __BackPack__ {

    static int selectRole;

    public static void selectRole() {
        System.out.print("Select your Role : ");

        selectRole = sc.nextInt();

    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        label:

        while (true) {

            System.out.println("\n............Welcome to BACK-PACK................");
            System.out.println("   1.Enter as Instructor");
            System.out.println("   2.Enter as Student");
            System.out.println("   3.Exit");

            selectRole();
            if (1 <= selectRole || selectRole <= 3) {

                switch (selectRole) {

                case 1:

                    InstructorMenu.main(args);

                    break label;

                case 2:
                    StudentMenu.main(args);

                    break label;

                case 3:

                    System.exit(1);

                }

            }

            else {
                System.out.print("wrong choice .... try again");
                __BackPack__.main(args);
            }

        }
    }

}
