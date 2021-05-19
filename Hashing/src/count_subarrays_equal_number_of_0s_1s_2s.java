import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class count_subarrays_equal_number_of_0s_1s_2s {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        String key = (count_1-count_0) +"#" + (count_2 - count_1);
        long count = 0;
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put(key, 1);
        for (int i=0; i<n; i++){
            if (arr[i] == 0){
                count_0++;
            }
            else if (arr[i] == 1){
                count_1++;
            }
            else {
                count_2++;
            }

            key = (count_1-count_0) +"#" + (count_2 - count_1);

            if (mp.containsKey(key)){
                count = count + mp.get(key);
                mp.put(key, mp.get(key)+1);
            }
            else {
                mp.put(key, 1);
            }

        }
        System.out.println(count);

    }
}
