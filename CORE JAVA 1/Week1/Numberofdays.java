package newprog;

import java.util.Scanner;

public class Numberofdays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month (1-12): ");
        int month = input.nextInt();

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 2:
                System.out.println("Enter year:");
                int year = input.nextInt();

                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;

            default:
                System.out.println("Invalid month");
        }

        input.close();
    }
}

