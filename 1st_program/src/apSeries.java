import java.util.Scanner;
import java.lang.Math;
public class apSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int d,AP=0;
        d = B-A;
        AP = A+(n-1)*d;
        System.out.println(AP);


    }
}
