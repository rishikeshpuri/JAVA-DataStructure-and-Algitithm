import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Maximum_of_all_subarrays_of_size_K {
    public static void maxVal(int[] arr, int n, int k){

        Deque<Integer> dq = new LinkedList<>();

        for (int i=0; i<k;i++){
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }


        for (int i=k; i<n; i++){
            System.out.print(arr[dq.peekFirst()]+" ");
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
//            dq.addLast(i);
            while (!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            dq.addLast(i);
        }

        System.out.print(arr[dq.peekFirst()]+" ");


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

//        System.out.println(maxVal(arr, n, k));
        maxVal(arr, n, k);
    }
}
