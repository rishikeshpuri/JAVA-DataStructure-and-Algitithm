//Given an array arr[] of size N and a number K, the task is to
// find the smallest number M such that the sum of the array becomes
// lesser than or equal to the number K when every element of that array
// is divided by the number M.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewtonSchool__k_Sum {
    public static boolean valid(int mid, int[] arr, int k, int n){
        int sum = 0;
        for (int i=0; i<n; i++){
//            sum = sum +  (int)Math.ceil(arr[i]/mid);
            sum+=(arr[i]-1)/mid + 1;
        }
        if (sum <= k){
            return true;
        }
        else return false;
    }
    public static int findSmallestDivisor(int n, int k,int[] arr){
        int minDivisor = 1;
        int maxDivisor = 100000;
        int M = maxDivisor;

        while (minDivisor<=maxDivisor){
            int mid = minDivisor + (maxDivisor - minDivisor)/2;
            boolean midResultsValidSum = valid(mid, arr, k,n);
            if (midResultsValidSum){
                M = mid;
                maxDivisor = mid-1;
            }
            else {
                minDivisor = mid+1;
            }
        }
        return M;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);

        String[] a = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(a[i]);
        }

        System.out.println(findSmallestDivisor(n, k, arr));
    }
}
