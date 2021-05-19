import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class pairs_with_given_sum_K {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];

        HashMap<Integer, Integer> mp = new HashMap<>();
        long count=0;

        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
            int x = k - arr[i];
            if (mp.containsKey(x)){
                count += mp.get(x);
            }
            if (mp.containsKey(arr[i])){
                int temp = mp.get(arr[i]);
                mp.put(arr[i], temp+1 );
            }
            else {
                mp.put(arr[i], 1);
            }
        }
        System.out.println(count);
    }
}
