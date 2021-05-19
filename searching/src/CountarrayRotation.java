import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountarrayRotation {
//
//    public static int countRotaion(int n, int[] arr){
//        int start = 0;
//        int end = n-1;
////        int pivot = -1;
////        if (arr[0] == arr[n-1]){
////            return 0;
////        }
//        while (start<=end){
//            if (arr[start] <= arr[end]){
//                return arr[start];
//            }
//            int mid = start+ (end-start)/2;
//            int next = (mid + 1) % n;
//            int prev = (mid - 1+ n) % n;
//
//            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
//                return arr[mid];
//            }
//            else if (arr[mid] >= arr[start]){
//                start = mid+1;
//            }
//            else if (arr[mid] <= arr[end]){
//                end = mid -1;
//            }
//
//        }
//        return -1;
//    }
public static int countRotaion(int[] arr, int n) {
    if (arr.length == 0) return -1;
    if (arr.length == 1) return arr[0];

    int start = 0;
    int end = n-1;
    while (start<end){
        int mid = start + (end-start)/2;
        if (mid > 0 && arr[mid] < arr[mid-1]){
            return mid;
        }
        else if (arr[mid] >= arr[start] && arr[mid] >  arr[end]){
            start = mid+1;
        }
        else {
            end = mid-1;
        }
    }
    return start;
}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test -- >0){
            int n = Integer.parseInt(br.readLine());

            String[] a = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(a[i]);
            }
            System.out.println(countRotaion(arr, n));
//            for (int i=0; i<n; i++){
//                System.out.println(arr[i]);
//            }
        }
    }
}
