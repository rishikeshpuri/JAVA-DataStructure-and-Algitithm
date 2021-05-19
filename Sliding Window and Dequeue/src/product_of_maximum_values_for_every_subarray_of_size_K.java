import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class product_of_maximum_values_for_every_subarray_of_size_K {
//    public static long prodOfMaxVal(int[] arr, int n, int k){
//        int i=0;
//        int j=0;
//        long MAX = Long.MIN_VALUE;
//        long res=1;
//        if (n < k){
//            return -1;
//        }
//        while (j <n){
//            MAX = Long.max(MAX, arr[j]);
//            if (j-i+1 < k){
//                j++;
//            }
//            else if (j-i+1 == k){
//                res = ((res)%1000000007  * (MAX)%1000000007)%1000000007;
//                j++;
//                i++;
//            }
//        }
//        return res;
//    }
    public static long prodOfMaxVal(int[] arr, int n, int k){
        long prod = 1;
        Deque<Integer> dq = new LinkedList<>();
        for (int i=0; i<k;i++){
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (int i=k; i<n;i++){
            prod = ((prod % 1000000007) * (arr[dq.peekFirst()]%1000000007))%1000000007;
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            while (!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            dq.addLast(i);

        }
        prod = ((prod % 1000000007) * (arr[dq.peekFirst()]%1000000007))%1000000007;
        return prod;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println(prodOfMaxVal(arr, n, k));
    }
}
