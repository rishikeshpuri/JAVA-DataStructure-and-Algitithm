import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_First_K_elements_of_Queue {
    public static Queue<Integer> Reverse(Queue<Integer>queue, int K){
        Stack<Integer> stk = new Stack<>();
        for (int i=0; i < K; i++){
            int x = queue.peek();
            stk.push(x);
            queue.remove();
        }
        while (!stk.isEmpty()){
            queue.add(stk.pop());
        }
        for (int i = 0; i<queue.size()-K; i++){
            int x = queue.peek();
            queue.remove();
            queue.add(x);
        }
        return queue;
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
        Queue<Integer> qu = new LinkedList<>();
        for (int i=0; i<n; i++){
            qu.add(arr[i]);
        }
        System.out.println(qu);
        Reverse(qu, k);
        System.out.println(qu);



    }
}
