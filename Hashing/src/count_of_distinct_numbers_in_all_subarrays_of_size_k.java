import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class count_of_distinct_numbers_in_all_subarrays_of_size_k {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0;i<k; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1 );
        }
        System.out.print(mp.size()+" ");
        for (int i =k; i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1 );
//            remove earlier window
            if (mp.get(arr[i-k]) == 1){
                mp.remove(arr[i-k]);
            }
            else {
                mp.put(arr[i-k], mp.get(arr[i-k])-1 );
            }
            System.out.print(mp.size()+" ");
        }


    }
}
