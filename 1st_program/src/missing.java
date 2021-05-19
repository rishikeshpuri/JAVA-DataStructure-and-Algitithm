import java.util.Scanner;
import java.util.Arrays;
public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr;
        arr = new int[n];

        for (int i=0; i<n-1;i++) {
            arr[i] = sc.nextInt();
        }
        int totalSum= (n*(n+1))/2;
        int sum=0;
        for (int i=0; i<n-1;i++){
            sum = sum + arr[i];
        }
        int missingNumber = totalSum-sum;
        System.out.println(missingNumber);




    }
}
