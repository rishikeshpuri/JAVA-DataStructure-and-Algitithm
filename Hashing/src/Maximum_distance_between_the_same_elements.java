import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Maximum_distance_between_the_same_elements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max_dis= 0;
        for (int i=0; i<n; i++){
            if (mp.containsKey(arr[i])){
                int temp_len = i - mp.get(arr[i]);
                if (temp_len > max_dis){
                    max_dis = temp_len;
                }
//                max_dis = Math.max(max_dis, i - mp.get(arr[i]));
            }
            else {
                mp.put(arr[i], i);
            }
        }
        System.out.println(max_dis);
    }
}
