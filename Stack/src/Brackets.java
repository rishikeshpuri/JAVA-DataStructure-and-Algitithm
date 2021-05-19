import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        char[] ch = str.toCharArray();

        Stack<Character> stk = new Stack<>();
        for (int i=0; i < n; i++){
            char c = ch[i];
            if (c == '(' || c == '{' || c == '['){
                stk.push(ch[i]);
            }
            else if (c == ')' || c == '}' || c == ']'){
                if (stk.isEmpty()){
                    System.out.println("NO");
                    return;
                }
                char top = stk.peek();
                if (c == ')' && top == '('){
                    stk.pop();
                }
                else if (c == '}' && top == '{'){
                    stk.pop();
                }
                else if (c == ']' && top == '['){
                    stk.pop();
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (stk.isEmpty()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
