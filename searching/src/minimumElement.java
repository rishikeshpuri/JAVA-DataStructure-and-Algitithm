import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minimumElement {
//    public static int minimum_Element(int[] arr, int n) {
//        int start = 0;
//        int end = n - 1;
//        while (start <= end) {
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
//            else if (arr[mid] > arr[mid-1]){
//                end = mid-1;
//            }
//            else if (mid == 0){
//                if (arr[mid] < arr[mid+1]){
//                    return arr[mid];
//                }
//                else return arr[mid+1];
//            }
//            else if (mid==n-1){
//                if (arr[mid] < arr[mid-1]){
//                    return arr[mid];
//                }
//                else return arr[mid-1];
//            }
//
//        }
//        return -1;
//    }

        public static int minimum_Element(int[] arr, int n) {
            if (arr.length == 0) return -1;
            if (arr.length == 1) return arr[0];

            int start = 0;
            int end = n-1;
            while (start<end){
                int mid = start + (end-start)/2;
                if (mid > 0 && arr[mid] < arr[mid-1]){
                    return arr[mid];
                }
                else if (arr[mid] >= arr[start] && arr[mid] >  arr[end]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            return arr[start];
        }

    //    }(arr[mid] >arr[mid-1] && arr[mid] >= arr[mid+1] || arr[mid] > arr[end])
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test -- >0){
        int n = Integer.parseInt(br.readLine());

        String[] a = br.readLine().split(" ");
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(a[i]);
        }

        System.out.println(minimum_Element(arr, n));
    }
    }
}
