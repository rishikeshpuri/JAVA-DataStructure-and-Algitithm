import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Sum_of_minimum_and_maximum_elements_subarrays {
    public static long sumOfMaxMinVal(int[] arr, int n, int k){
        long sum = 0;
        Deque<Integer> dq_Max = new LinkedList<>();
        Deque<Integer> dq_Min = new LinkedList<>();

//        MAX
        for (int i=0; i<k;i++){
            while (!dq_Max.isEmpty() && arr[i] >= arr[dq_Max.peekLast()]){
                dq_Max.removeLast();
            }
            dq_Max.addLast(i);
        }

//          Min
        for (int i=0; i<k;i++){
            while (!dq_Min.isEmpty() && arr[i] <= arr[dq_Min.peekLast()]){
                dq_Min.removeLast();
            }
            dq_Min.addLast(i);
        }
//        --------------------------
        for (int i=k; i<n;i++){
            sum = sum + arr[dq_Max.peekFirst()] + arr[dq_Min.peekFirst()];
//            MAX
            while (!dq_Max.isEmpty() && arr[i] >= arr[dq_Max.peekLast()]){
                dq_Max.removeLast();
            }
            while (!dq_Max.isEmpty() && dq_Max.peekFirst() <= i-k){
                dq_Max.removeFirst();
            }
            dq_Max.addLast(i);

//            Min
            while (!dq_Min.isEmpty() && arr[i] <= arr[dq_Min.peekLast()]){
                dq_Min.removeLast();
            }
            while (!dq_Min.isEmpty() && dq_Min.peekFirst() <= i-k){
                dq_Min.removeFirst();
            }
            dq_Min.addLast(i);

        }
        sum = sum + arr[dq_Max.peekFirst()] + arr[dq_Min.peekFirst()];
        return sum;


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

        System.out.println(sumOfMaxMinVal(arr, n, k));
    }
}
