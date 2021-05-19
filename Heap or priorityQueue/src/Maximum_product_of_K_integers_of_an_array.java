import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Maximum_product_of_K_integers_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            long prod = 1;
            for (int i=0; i<n;i++){
                int a = sc.nextInt();
                pq.add(a);
            }
            int cout = 0;
            while (!pq.isEmpty() && cout < k){
                prod *= pq.poll();
                cout++;
            }
            System.out.println(prod);
        }
    }
}
