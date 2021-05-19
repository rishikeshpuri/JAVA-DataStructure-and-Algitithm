import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Min_Cut_Tree {
    //    this fun is used to collected no of woods i.s equal to mid
    public static long collected(int mid, int n, int[] arr){
        long sum=0;
        for (int i = n-1; i>=0;i--){
            if (arr[i] - mid <=0){
                break;
            }
            sum+= arr[i] - mid;
        }
        return sum;
    }
    public static int minumCut(int[] arr, int n, long k){
//        this fun is used to find mid BY BINARY SEARCH which is min value of x ; (mid = x)
        Arrays.sort(arr);
        int low = 1;
        int high = 100000;
        // int cut=0;
        int cut_wood=0;
        while (low <= high){
            int mid = low+(high-low)/2;
            long wood_collected = collected(mid, n, arr);

            if (wood_collected == k){
                // cut = mid;
                return mid;
            }
            else if (wood_collected > k){
                low = mid+1;
            }
            else {
                cut_wood=mid;
                high=mid-1;
            }
        }
        return cut_wood;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        long k = Integer.parseInt(s[1]);

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
//        for (int i =0; i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(minumCut(arr, n, k));
    }
}
