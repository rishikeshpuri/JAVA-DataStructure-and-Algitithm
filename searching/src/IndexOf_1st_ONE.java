import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOf_1st_ONE {
    public static int index(int k, int[] arr){
        int start = 0;
        int end = 1;
        while (k > arr[end]){
            start=end;
            end=2*end;

        }
        System.out.println(start+" "+ end);
        int res = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (k == arr[mid] ){
                res = mid;
                end = mid-1;
            }
//            else if (k == arr[mid]){
//                end= mid-1;
//            }
            else {
                start = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args)throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int k = 1;
//            int[] arr = {0, 0, 1, 1, 1, 1};
            int[] arr = {0, 0,0,0,0,0,0,0,0,0,0, 1, 1, 1, 1,1,1,1,1,1,1,1,1,1};
            System.out.println( index(k, arr));
    }
}
