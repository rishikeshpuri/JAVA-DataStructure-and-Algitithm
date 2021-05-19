import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Modularexponentiation {
    public static long power(long N, long P, long mod){
        long result = 1;
        N = N % mod;
        long one = 1L;
        if (N == 0){
            return 0;
        }
        while (P>0){
            long oddeven = P & one;
            if (oddeven == 1L){ // P is odd
                result = (result * N)%mod;
                P--;
            }
            else { // P is even
                N = (N * N)% mod;
                P = P/2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long P = sc.nextLong();
        long mod = 1000000007;
        System.out.println(power(N, P, mod));
    }
}
