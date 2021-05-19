import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class doublet {
    public static void doublet(int[] arr, int n, int p){
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int result=0;
        while (j<n){
            if (i == j){
                j++;
                continue;
            }
            if ((arr[j] - arr[i]) > p){
                i++;
            }
            else {
                System.out.println(j+" " + i);
                int x = j-i;
                result += (x * (x-1))/2;
                j++;
            }

        }
        System.out.println(result);
    }
//    public static void doublet(int[] arr, int n, int p){
////        int n = arr.length;
//        int j = 1;
//        int total = 0;
//        for (int i=0; i<n;i++){
//            while (j<n && arr[j]-arr[i] <=p){
//
//                j++;
//            }
//
//            j--;
//            System.out.println(j+" " + i);
//            int x = j-i;
//            total+=x;
//        }
//        System.out.println(total);
//    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int p = Integer.parseInt(strArr[1]);

        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        doublet(arr, n, p);
    }
}