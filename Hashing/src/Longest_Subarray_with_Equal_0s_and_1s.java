import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Longest_Subarray_with_Equal_0s_and_1s {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[] strArr = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i =0; i<n;i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }
            HashMap<Integer, Integer> mp = new HashMap<>();
            int sum=0;
            int max_len = 0;
            for (int i=0; i<n;i++){
                if (arr[i] == 0){
                    arr[i] = -1;
                }
                sum += arr[i];

                if (sum == 0){
                    max_len = i+1;
                }
                if (mp.containsKey(sum)){
                    int tem_subLen = i - mp.get(sum);
                    if (tem_subLen > max_len){
                        max_len = tem_subLen;
                    }
                    mp.put(sum, i);
                }
                else {
                    mp.put(sum, i);
                }
            }
        System.out.println(max_len);

    }
}
