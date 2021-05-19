import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimum_Cost_of_ropes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            int n = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int i=0; i<n;i++){
                int a = sc.nextInt();
                pq.add(a);
            }
            long sum = 0;
            while (pq.size() > 1) {
                int x = pq.poll();
                int y = pq.poll();
                sum += x + y;
                pq.add(x + y);

            }
            System.out.println(sum);

        }
    }
}
