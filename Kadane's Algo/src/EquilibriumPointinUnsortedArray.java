import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPointinUnsortedArray {
    public static int equilibriumPoint(int[] arr, int n){
        //prefix sum array from 0
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i=1; i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        //suffix sum array from n-1
        int[] sufix = new int[n];
        sufix[n-1] = arr[n-1];
        for (int i=n-2; i>=0;i--){
            sufix[i] = sufix[i+1] + arr[i];
        }
        //Find the point where prefix and suffix
        // sums are same
        for (int i = 1; i < n - 1; i++) {
            if (prefix[i] == sufix[i])
                return i;
        }
        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(equilibriumPoint(arr, n));

    }
}
