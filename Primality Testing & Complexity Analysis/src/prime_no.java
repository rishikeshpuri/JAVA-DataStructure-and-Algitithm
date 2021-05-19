import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class prime_no {
    public static boolean prime(int n){
        if (n <= 1){
            return false;
        }
        for (int i=2; i*i<=n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int test = Integer.parseInt(br.readLine());

        while (test-- >0){
            int n = sc.nextInt();
            if (prime(n)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }

    }
}
