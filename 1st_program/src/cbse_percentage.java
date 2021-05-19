import java.util.Scanner;

public class cbse_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 Subjects :");
        System.out.println();

        System.out.print("Marks obtained in hindi :");
        float h = sc.nextByte();

        System.out.print("Marks obtained in english :");
        float e = sc.nextByte();

        System.out.print("Marks obtained in maths :");
        float m = sc.nextByte();

        System.out.print("Marks obtained in science :");
        float s = sc.nextByte();

        System.out.print("Marks obtained in computer :");
        float c = sc.nextByte();
        float total = h + e + m + s +c;
        float percentage = (h + e + m + s + c) / 5;

        System.out.print("Total Marks :");
        System.out.println(total);
        System.out.print("The percentage is :");
        System.out.print(percentage);


    }
}
