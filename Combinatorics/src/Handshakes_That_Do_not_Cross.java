import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Handshakes_That_Do_not_Cross {
    public static long catlanNumber(int N){
        long[] catlanArray = new long[N+1];
        catlanArray[0] = catlanArray[1] = 1;

        for (int j=2; j<=N;j++){
            catlanArray[j] = 0;
            for (int i=0; i<j;i++){
                catlanArray[j] += (catlanArray[i]* catlanArray[j-i-1])%1000000007;
                catlanArray[j] = catlanArray[j]%1000000007;
            }

        }
        return catlanArray[N];
    }
    public static long totalWays(int N){
        int one = N&1;
        if (one == 1){
            return 0;
        }
        int handShakes = N/2;
        return catlanNumber(handShakes);
    }

//    ----------------OR-----------------------
    public static Map<Integer, Integer> mp = new HashMap<>();

    public static int numberOfWays(int n) {
        if(mp.containsKey(n)) {
            return mp.get(n);
        }
        if(n % 2 == 1){
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        long sum = 0;
        for(int i = 0; i < n; i+=2) {
            sum += ((long)numberOfWays(i)) * numberOfWays(n-2-i);
            sum %= 1_000_000_007;
        }
        mp.put(n, (int)sum);
        return (int)sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println(totalWays(N));
        System.out.println(numberOfWays(N));
    }
}
