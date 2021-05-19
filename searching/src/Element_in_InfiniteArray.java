import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Element_in_InfiniteArray {
    public static int element( int k, int[] arr){
        int start = 0;
        int end = 1;
        while (k > arr[end] ){
            start = end;
            end = 2*end;
        }

        while (start <= end){
            int mid = start + (end - start)/2;
            if (k == arr[mid]){
                return mid;
            }
            else if (arr[mid] > k){
                end = mid-1;
            }
            else start = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println( element(k, arr));
        }
}
