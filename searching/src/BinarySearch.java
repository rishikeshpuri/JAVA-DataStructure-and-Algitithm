import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
    public static boolean binary_search(int n, int k, int[] arr){
        int start = 0;
        int end = n-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (k == arr[mid]){
                return true;
            }
            else if (k > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
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

            boolean result = binary_search(n, k, arr);
            if (result){
                System.out.println(1);
            }
            else {
                System.out.println(-1);
            }

        }


    }

}
