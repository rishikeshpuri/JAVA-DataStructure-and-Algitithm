import java.util.Scanner;
import java.lang.Math;

public class Compute_power {
    public static int Power(int m, int p){
        if (p<1){
            return 1;
        }
        return m*Power(m,p-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(Power(n1,n2));
        }

    }
}
