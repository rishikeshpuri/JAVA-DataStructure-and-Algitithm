import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Nearly_sorted {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] strArr = br.readLine().split(" ");
//        int n = Integer.parseInt(strArr[0]);
//        int k = Integer.parseInt(strArr[1]);
//        int[] arr = new int[n];
//        for (int i=0; i<n;i++) {
//            arr[i] = Integer.parseInt(strArr[i]);
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i=0; i < n; i++){
//            System.out.println(arr[i]);
//        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i < k+1; i++){
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++){
            arr[index] = pq.remove();
            pq.add(arr[i]);
            index++;
        }
        while (pq.size() > 0){
            arr[index] = pq.remove();
            index++;
        }
        for (int i=0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//-------------ASK----------
//Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int k = sc.nextInt();
//    PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i=0; i < k ; i++){
//        int x = sc.nextInt();
//        pq.add(x);
//        }
//        for (int i=0; i < n-k; i++){
//        int x = sc.nextInt();
//        System.out.print(pq.poll()+" ");
//        pq.add(x);
//        }
//        while (pq.size() > 0){
//        System.out.print(pq.poll()+" ");
//
//        }