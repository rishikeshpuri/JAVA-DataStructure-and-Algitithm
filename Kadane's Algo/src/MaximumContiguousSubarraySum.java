import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaximumContiguousSubarraySum {
    public static long kadanesAlgo(int[] arr, int n){
        long maximumSum = Integer.MIN_VALUE;
        long curSum = 0;
//        boolean positiveExist = false;
        for (int i=0; i<n;i++){
            curSum = curSum+ arr[i];
            if (curSum > maximumSum){
                maximumSum = curSum;
            }
            if (curSum < 0){
                curSum=0;
            }
        }
        return maximumSum;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
//        int test = sc.nextInt();
        while (test -- >0){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            String[] strArr = br.readLine().split(" ");
            for (int i=0; i<N;i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }
            // Kadanes Algo
            System.out.println(kadanesAlgo(arr, N));
        }
    }
}
