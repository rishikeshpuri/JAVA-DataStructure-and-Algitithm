import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareSortedArray {
    public static int[] squareSort(int[] arr, int n){
        int left = 0;
        int right = n-1;
        int[] res = new int[n];
        int k = n-1;

        while (left <= right){
            if (Math.abs(arr[left]) <= Math.abs(arr[right])){
                res[k] = arr[right] * arr[right];
                k--;
                right--;
            }
            else {
                res[k] = arr[left] * arr[left];
                k--;
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test -- >0){
            int n = Integer.parseInt(br.readLine());
            String[] strArr = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n;i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }
            int[] res = squareSort(arr, n);
//
            for (int i=0; i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }

    }
}
