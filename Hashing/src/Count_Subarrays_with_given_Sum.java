import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Count_Subarrays_with_given_Sum {
    public static int longestSubArr_K_sum(int[] arr, int n, int k){
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
// if i get sum-k =0(line no 16) then 0 will be there in hashtable
        mp.put(0,1);
        for (int i=0 ; i<n; i++){
            sum = sum + arr[i];

            if (mp.containsKey(sum - k)){
                count = count + mp.get(sum-k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }

        return count;
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
