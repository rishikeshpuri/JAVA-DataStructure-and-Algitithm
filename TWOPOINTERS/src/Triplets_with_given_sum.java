import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triplets_with_given_sum {
    public static int tripletSum(int[] arr, int n, int k){
        int count = 0;
        for (int i = 0; i< n-2; i++){
            long targetSum = Math.abs(k - arr[i]);
            int left = i+1;
            int right = n-1;
            while (left < right){
                if (arr[left] + arr[right] == targetSum){
                    count++;
                    left++;
                    right--;
                }
                else if (arr[left] + arr[right] > targetSum){
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int k = Integer.parseInt(br.readLine());

        System.out.println(tripletSum(arr, n, k));
    }
}
