import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_largest_element {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-->0){
             String[] a = br.readLine().split(" ");
             int n = Integer.parseInt(a[0]);
             int k = Integer.parseInt(a[1]);
             String[] strArr = br.readLine().split(" ");
             int[] arr = new int[n];
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i=0; i<n;i++){
                 arr[i] = Integer.parseInt(strArr[i]);
                 int num = arr[i];
                 pq.add(num);
                 if (pq.size() > k){
                     pq.remove();
                 }
             }
            System.out.println(pq.poll());

        }
    }
}
