import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeakElement_In_UNSORTED_array {
    public static int peakElement(int[] arr, int n){
        int start = 0;
        int end = n-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid > 0 && mid < n-1){
                if (arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]){
                    return arr[mid];
                }
                else if (arr[mid] < arr[mid+1]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else if (mid==0){
                if (arr[0] > arr[1]){
                    return arr[mid];
                }
                else return arr[mid+1];
            }
            else if (mid == n-1){
                if (arr[n-1] > arr[n-2]){
                    return arr[n-1];
                }
                else return arr[n-2];
            }

        }
        return -1;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test -- >0){
            int n = Integer.parseInt(br.readLine());

            String[] a = br.readLine().split(" ");
            int [] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(a[i]);
            }

            System.out.println(peakElement(arr, n));
        }
    }
}
