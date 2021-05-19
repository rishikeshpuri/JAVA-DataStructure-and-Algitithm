import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countOccurance {
    public static int Last_occou(int n, int k, int[] arr){
        int start = 0;
        int end = n-1;
        int count = 0;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (k == arr[mid]){
                count+=1;
                start = mid + 1;
            }
            else if (k > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return count;
    }
    public static int First_occu(int n, int k, int[] arr){
        int start = 0;
        int end = n-1;
        int count = 0;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (k == arr[mid]){
                count+=1;
                end = mid - 1;
            }
            else if (k > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        int res = 0;
        while (test -- >0){
            String[] stArr = br.readLine().split(" ");
            int n = Integer.parseInt(stArr[0]);
            int k = Integer.parseInt(stArr[1]);

            String[] a = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(a[i]);
            }

            res = First_occu(n, k, arr) + Last_occou(n,k,arr) - 1;
            System.out.println(res);


        }
    }
}
