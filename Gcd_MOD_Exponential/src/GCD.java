import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GCD {
    public static int countDivisors(long n){
        int count = 0;
        for (int i=1; i<= Math.sqrt(n); i++){
            if (n % i == 0){
                if (n/i == i){
                    count++;
                }
                else {
                    count +=2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(countDivisors(n));
    }
}
