// Q> Given the marks of N students, your task is to calculate the average of the marks obtained.


import java.util.Scanner;

public class Average_student_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Students");
        int n = sc.nextInt();
        int student = 1;
        int marks = 0;
        while (student <=n){
            System.out.println("enter student marks");
            marks = sc.nextInt();
            marks += marks;
            student++;
        }
        int avgMarks = marks / n;
        System.out.println(avgMarks);

//        Scanner sc = new Scanner(System.in);
//        int stuNumber = sc.nextInt();
//        int sum=0, marks;
//        for(int i=1; i<=stuNumber; i++){
//            marks = sc.nextInt();
//            sum+=marks;
//        }
//        System.out.println(sum/stuNumber);
    }
}
