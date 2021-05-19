import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EvaluatePostFixExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        Stack<Integer> stk = new Stack<>();
//        System.out.println(stk);
        for (int i=0; i<n; i++){
            if (strArr[i].equals( "+") || strArr[i].equals( "-")|| strArr[i].equals( "*") || strArr[i].equals( "/")){
                int b = stk.pop();
                int a = stk.pop();
                int z;
                if (strArr[i].equals( "+")){
                    z = a+b;
                }
                else if (strArr[i].equals( "-")){
                    z = a-b;
                }
                else if (strArr[i].equals( "*")){
                    z = a*b;
                }
                else {
                    z = a/b;
                }
                stk.push(z);
            }
            else {
                stk.push(Integer.parseInt(strArr[i]));

            }
        }
        System.out.println(stk.pop());
    }
}
