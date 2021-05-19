import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Next_Larger_Element {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int[] solu = new int[n];

        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for (int i =1; i<n; i++){
            int curEle = arr[i];
            while (!stk.empty() && curEle >  arr[stk.peek()] ){
//                int x = stk.pop();
//                solu[x] = curEle;
//                above two process are doing in single line below
                solu[stk.pop()] = curEle;
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
