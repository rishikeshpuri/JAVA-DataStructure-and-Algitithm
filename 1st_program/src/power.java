import java.util.Scanner;
import java.lang.Math;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        int power=0;
        while (i<=N){
            int a = sc.nextInt();
            int b = sc.nextInt();
            power = (int)(Math.pow(a,b));
            System.out.println(power);
            i++;
        }
    }
}
