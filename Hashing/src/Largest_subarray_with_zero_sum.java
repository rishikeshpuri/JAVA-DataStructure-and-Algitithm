import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Largest_subarray_with_zero_sum {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int sum=0;
        int maxSubArrLen = 0;
        int temp=0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<n; i++){
            sum = sum + arr[i];
//            System.out.println("sum = "+ sum);
            if (arr[i] == 0 && maxSubArrLen ==0){
                maxSubArrLen = 1;
            }
            if (sum == 0){
                maxSubArrLen = i+1;
            }
//            ----------------------------------
//            if (mp.containsKey(sum)){
//                temp = i - mp.get(sum);
////                mp.put(sum, i);
////                System.out.println("temp "+ temp);
//            }
//            else {
//                mp.put(sum, i);
//            }
//                      OR
            if (mp.containsKey(sum)){
                maxSubArrLen = Math.max(maxSubArrLen, i-mp.get(sum));
            }
            else {
                mp.put(sum,i);
            }

            if (temp > maxSubArrLen ){
                maxSubArrLen = temp;
//                System.out.println("max "+ maxSubArrLen);
            }
//         ---------------------------------------
        }
        if (maxSubArrLen>0){
            System.out.println(maxSubArrLen);
        }
        else {
        System.out.println(-1);
        }
    }

}
