//Q> Calculators are widely used devices nowadays. It makes calculations easier and faster. A simple calculator consists of the following operators:
        //1. '+': adding two numbers
        //2. '- ': subtraction
        //3. '*': multiplying numbers
        //4. '/': division


import java.util.Scanner;


public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1St number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter operator-> {+, - , *, /}");
        char operator = sc.next().charAt(0);

        switch (operator){
            case ('+'):
                System.out.println(a+b);
                break;
            case ('-'):
                System.out.println(a-b);
                break;
            case ('*'):
                System.out.println(a*b);
                break;
            case ('/'):
                System.out.println(a/b);
                break;


        }
    }
}
