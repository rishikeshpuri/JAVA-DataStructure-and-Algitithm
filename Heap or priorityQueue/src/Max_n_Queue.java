import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Max_n_Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<n;i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            pq.add(arr[i]);
        }
        int query = Integer.parseInt(br.readLine());
        while (query -- >0){
//            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            String[] a = br.readLine().split(" ");
            int q = Integer.parseInt(a[0]);

            if (q == 1){
                int x = Integer.parseInt(a[1]);
                pq.add(x);
            }
            else {
                System.out.println(pq.peek());
            }
        }

    }
}
