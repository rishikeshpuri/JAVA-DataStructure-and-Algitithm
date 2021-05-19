import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class StrangeString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Character> dq = new LinkedList<>();
        for (int i=0;i<n;i++){
//            System.out.print(i+" ");
            int asc = 97 + (i%26);
//            System.out.println();
//            System.out.println(asc+" ");
            if (asc%2 == 0){
                dq.addLast((char)asc);
            }
            else {
                dq.addFirst((char)asc);
            }
        }
        for (Character ch :dq){
            System.out.print(ch);
        }

    }
}
