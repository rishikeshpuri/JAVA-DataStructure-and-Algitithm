import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Generate_Binary_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n -- >0){
            String x = q.peek();
            System.out.print(x +" ");
            q.remove();
            q.add(x + "0");
            q.add(x + "1");

        }
    }
}
