import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
//        int age = 82;
//        if (age>18) {
//            System.out.println("Yes Drive!");
//        }
//        else {
//            System.out.println("Not allow!");
//        }

//        boolean a = true;
//        boolean b = false;
//        boolean c = false;
//        if (a && b || c){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//
//        System.out.println("----------");
//        if (a || b && c){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//        int age;
//        System.out.println("Enter your age :");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        System.out.println(age);
//
//        switch (age){
//            case 18:
//                System.out.println("you become adult");
//                break;
//            case 23:
//                System.out.println("you do job");
//                break;
//            case 60:
//                System.out.println("you retier");
//                break;
//            default:
//                System.out.println("you enjoy");
//                break;
//
//        }
//        System.out.println("Good Boyy!");


//        int sub1;
//        int sub2;
//        int sub3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter 1st sub marks");
//        sub1 = sc.nextInt();
//        System.out.println("enter 1st sub marks");
//        sub2 = sc.nextInt();
//        System.out.println("enter 1st sub marks");
//        sub3 = sc.nextInt();
//
//        float avg = (sub1 + sub2 + sub3)/3.0f;
//        System.out.println("Overall % is "+  avg);
//        if (avg> 40 && sub1 >= 33 && sub2 >=33 && sub3 >=33){
//            System.out.println("pass");
//        }
//        else {
//            System.out.println("fail");
//        }

//
//        float income;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income per annum");
//        income = sc.nextInt();
//        if (income>= 250000 && income < 500000) {
//            float taxPay = income*0.05f;
//            income = income - taxPay;
//            System.out.println("You income after paid tax is :" + income);
//        }
//        else if (income>= 500000 && income < 1000000) {
//            float taxPay = income*0.2f;
//            income = income - taxPay;
//            System.out.println("You income after paid tax is :" + income);
//        }
//        else if (income >= 1000000 ){
//            float taxPay = income*0.3f;
//            income = income - taxPay;
//            System.out.println("You income after paid tax is :" + income);
//        }
//        else {
//            float taxPay = income;
//            System.out.println("You income after paid tax is :" + taxPay);
//        }
//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Week Days Number between 1 to 7: ");
        String day = sc.nextLine();

        switch (day){
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tue");
                break;
            case "3":
                System.out.println("Wed");
                break;
            case "4":
                System.out.println("Thu");
                break;
            case "5":
                System.out.println("Fri");
                break;
            case "6":
                System.out.println("Sat");
                break;
            case "7":
                System.out.println("Sun");
                break;
            default:
                System.out.println("Entered wrong number");

            }
        }

    }

