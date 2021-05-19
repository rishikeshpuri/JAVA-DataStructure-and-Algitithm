import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearlySortedArray {
    public static int Nearly_binary_search(int n, int k, int[] arr){
        int start = 0;
        int end = n-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (k == arr[mid]){
                return mid;
            }
            else if (mid-1 >= start && arr[mid-1] == k){
                return mid-1;
            }
            else if (mid+1 <= end && arr[mid+1] == k){
                return mid+1;
            }
            else if (arr[mid] > k){
                end = mid-2;
            }
            else start = mid+2;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test -- >0){
            String[] stArr = br.readLine().split(" ");
            int n = Integer.parseInt(stArr[0]);
            int k = Integer.parseInt(stArr[1]);

            String[] a = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(a[i]);
            }
            System.out.println(Nearly_binary_search(n, k, arr));

        }


    }
}
