import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D_Triplets {
    public static void triplet(int[] arr, int n, int p){
        Arrays.sort(arr);
        int i = 0;
        int j = 2;
        int result=0;
        while (j<n){
            if (i == j-1){
                j++;
                continue;
            }
            if ((arr[j] - arr[i]) > p){
                i++;
            }
            else {
                int x = j-i;
                result += (x * (x-1))/2;
                j++;
            }

        }
        System.out.println(result);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
         int n = Integer.parseInt(strArr[0]);
         int p = Integer.parseInt(strArr[1]);

         String[] s = br.readLine().split(" ");
         int[] arr = new int[n];
         for (int i=0; i<n;i++){
             arr[i] = Integer.parseInt(s[i]);
         }
         triplet(arr, n, p);
    }
}
