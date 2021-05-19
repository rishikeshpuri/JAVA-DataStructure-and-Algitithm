import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class count_subarrays_equal_number_of_0s_1s {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        long count = 0;
        int sum = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i=0; i<n; i++){
            if (arr[i] == 0){
                arr[i] = -1;
            }
            sum = sum + arr[i];

            if (sum == 0){
                count++;
            }
            if (mp.containsKey(sum)){
                count = count + mp.get(sum);
                mp.put(sum, mp.get(sum)+1);
            }
            else {
                mp.put(sum, 1);
            }

        }

        System.out.println(count);
    }
}
