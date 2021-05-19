// Q> Given the number of the month, your task is to calculate the number of days present in the particular month.

import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        System.out.println("Enter Month's number: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m){
            case (1):
                System.out.println(31);
                break;
            case (2):
                System.out.println(28);
                break;
            case (3):
                System.out.println(31);
                break;
            case (4):
                System.out.println(30);
                break;
            case (5):
                System.out.println(31);
                break;
            case (6):
                System.out.println(30);
                break;
            case (7):
                System.out.println(31);
                break;
            case (8):
                System.out.println(31);
                break;
            case (9):
                System.out.println(30);
                break;
            case (10):
                System.out.println(31);
                break;
            case (11):
                System.out.println(30);
                break;
            case (12):
                System.out.println(31);
                break;
            default:
                System.out.println("Entered Wrong Month number");
        }
    }
}
