import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeTwo_array {
    public static void mergeArray(int[] arr1, int[] arr2, int n, int m){
        int p = 0;
        int q = 0;
        int[] result = new int[n+m];
        int k =0;
        while (p < n && q < m){
            if (arr1[p] <= arr2[q]){
                result[k] = arr1[p];
                k++;
                p++;
            }
            else {
                result[k] = arr2[q];
                k++;
                q++;
            }
        }
        while (q < m){
            result[k] = arr2[q];
            k++;
            q++;
        }
        while (p < n){
            result[k] = arr1[p];
            k++;
            p++;
        }
        for (int i=0; i<m+n; i++){
            System.out.print(result[i]+" ");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] strArr1 = br.readLine().split(" ");
        String[] strArr2 = br.readLine().split(" ");
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr1[i] = Integer.parseInt(strArr1[i]);
        }
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i] = Integer.parseInt(strArr2[i]);
        }

        mergeArray(arr1, arr2, n, m);
    }
}
