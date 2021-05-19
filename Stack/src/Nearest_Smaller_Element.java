import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Nearest_Smaller_Element {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int[] solu = new int[n];
        Stack<Integer> stk = new Stack<>();
        stk.push(n-1);
        for (int i = n-2; i>=0; i--){
            int cur = arr[i];
            while (!stk.isEmpty() && cur < arr[stk.peek()]){
                solu[stk.pop()] = cur;
            }
            stk.push(i);
        }

        while (!stk.empty()){
            solu[stk.pop()] = -1;
        }
        for (int i=0; i<n;i++){
            System.out.print(solu[i]+" ");
        }
    }
}