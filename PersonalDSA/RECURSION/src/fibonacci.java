import java.util.Scanner;

public class fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return ( fib(n - 1) + fib(n - 2) );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
        System.out.println("---------------");
        for (int i=0; i<=n; i++){
            System.out.print(fib(i)+ " ");
        }
    }
}
