import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Largest_subarray_with_sum_k {
    public static int longestSubArr_K_sum(int[] arr, int n, int k){
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0 ; i<n; i++){
            sum = sum + arr[i];
//            if i get k at index 0
            if (sum == k){
                maxLen = i+1;
            }
//            If K get in array
            if (arr[i] == k && maxLen == 0){
                maxLen=1;
            }
            if (!mp.containsKey(sum)){
                mp.put(sum, i);
            }
            int temp_length = 0;
            if (mp.containsKey(sum - k)){
                temp_length = i - mp.get(sum-k);
            }
            if (temp_length > maxLen){
                maxLen = temp_length;
            }

        }
        return maxLen;
    }
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int test = Integer.parseInt(br.readLine());
            while (test-- >0){
                String[] s = br.readLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int k = Integer.parseInt(s[1]);
                String[] strArr = br.readLine().split(" ");
                int[] arr = new int[n];
                for (int i=0; i<n;i++){
                    arr[i] = Integer.parseInt(strArr[i]);
                }
                System.out.println(longestSubArr_K_sum(arr, n, k));
            }



    }
}
