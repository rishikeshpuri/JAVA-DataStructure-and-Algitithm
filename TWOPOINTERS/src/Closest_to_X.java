import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Closest_to_X {
    public static void absDifference(int[] arr1, int[] arr2,int len,int x){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long res = Integer.MAX_VALUE;
//        for (int i=0; i<len;i++){
//            for (int j=0; j<len;j++){
//            long sum = Math.abs(arr1[i] + arr2[j]);
//            long diff = Math.abs(sum - x);
//            res = Math.min(res, diff);
//            }
//        }
       int p = 0;
       int q = len-1;
//       int leftArr = 0;
//       int rightArr = 0;
       while (p < len && q >= 0){
           if (Math.abs(arr1[p] + arr2[q] - x) < res){
//               leftArr = p;
//               rightArr = q;
               res = Math.abs(arr1[p] + arr2[q] - x);
           }
           if (arr1[p] + arr2[q] > x){
               q--;
           }
           else {
               p++;
           }
       }
        System.out.println(res);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] strArr1 = br.readLine().split(" ");
        String[] strArr2 = br.readLine().split(" ");

        int x = Integer.parseInt(br.readLine());

        int[] arr1 = new int[len];
        for (int i=0; i<len;i++){
            arr1[i] = Integer.parseInt(strArr1[i]);
        }

        int[] arr2 = new int[len];
        for (int i=0; i<len;i++){
            arr2[i] = Integer.parseInt(strArr2[i]);
        }
        absDifference(arr1, arr2, len, x);

//        for (int i=0; i<len;i++){
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        for (int i=0; i<len;i++){
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println();
//        System.out.println(x);
    }
}
