import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Remove_middle {
//    public static Stack<Integer> deleteMid(Stack<Integer> s, int N){
////        Stack<Integer> stk = new Stack<>();
//        int i =N-1;
//        int mid = N/2;
//        Stack<Integer> stk = new Stack<>();
//        while (i > mid){
//            stk.push(s.pop());
//            i--;
//        }
//        System.out.println(s.pop());
//        System.out.println(s);
//        System.out.println(i + "-----");
//        i = mid - 1;
//        System.out.println(i +"====");
//        while (i >= 0){
//            stk.push(s.pop());
//            i--;
//        }
//        i = 0;
//        while (i < stk.size()){
//            s.push(stk.pop());
//        }
////        System.out.println(s);
//        return s;
//    }
//    EFFICIENT WAY
public static Stack<Integer> deleteMid(Stack<Integer> s, int N){
    if (s.isEmpty()){
        return s;
    }
    int mid = N/2 + 1;
    delete(s, mid);
    return s;
}
public static void delete(Stack<Integer> s, int k){
    if (k == 1){
        s.pop();
        return;
    }
    int temp = s.peek();
    s.pop();
    delete(s, k-1);
    s.push(temp);
    return;
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i<n; i++){
            stk.push(arr[i]);
        }
        System.out.println(stk);
//        deleteMid(stk, n);
        System.out.println(deleteMid(stk, n));

    }
}
