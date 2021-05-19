import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Kth_SmallestDifference {
    public static boolean doub(int[] arr, int mid, int n, int p){
//        int n = arr.length;
        int j = 1;
        int total = 0;
        for (int i=0; i<n;i++){
            while (j<n && arr[j]-arr[i] <=mid){
                j++;
            }
            j--;
            int x = j-i;
            total+=x;
        }
        return total>=p;
//        int i = 0;
//        int j = 1;
//        int res = 0;
//        while (j < n){
//            if (i == j){
//                j++;
//            }
//            if ((arr[i] - arr[j]) > mid ){
//                i++;
//            }
//            else {
//                int x = j-i;
//                res = res + (x*(x-1))/2;
//                j++;
//            }
//        }
//        return res >=p;
    }
    public static int absoluteDiff(int[] arr, int n, int p) {
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int l = 0;
        int r = diff;
        while (l<r){
            int mid = l+(r-l)/2;
            if (doub(arr, mid, n, p)){
                r = mid;
            }
            else {
                l = mid+1;
            }
        }
        return l;

    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test -- >0){
            String[] strArr = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int p = Integer.parseInt(strArr[1]);

            String[] s = br.readLine().split(" ");
            int[] arr = new  int[n];
            for (int i=0; i<n;i++){
                arr[i] = Integer.parseInt(s[i]);
            }
//            for (int i=0; i<n;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//            System.out.println("----------");
            System.out.println(absoluteDiff(arr, n, p));
        }

    }
}
