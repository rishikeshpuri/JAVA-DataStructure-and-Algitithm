import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class sum_of_minimum_element_of_all_subarrays {
    public static class Pair{
        int element;
        int minNumReplace;
        public Pair(int ele, int mn){
            element = ele;
            minNumReplace = mn;
        }
    }
    public static long sumSubArray(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        Stack<Pair> stack1 = new Stack<>();
        Stack<Pair> stack2 = new Stack<>();

        int m =(int) Math.pow(10, 9);

        //        Filling left array
        for (int i=0;i<arr.length; i++){
            int cur_ele = arr[i];
            int count = 1;
            while (!stack1.isEmpty() && stack1.peek().element > cur_ele){
                count = count + stack1.peek().minNumReplace;
                stack1.pop();
            }
            stack1.push(new Pair(cur_ele, count));
            left[i] = count;
        }
        //        Filling right array
        for (int i = arr.length-1; i>=0; i--){
            int cur_ele = arr[i];
            int count=1;
            while (!stack2.isEmpty() && stack2.peek().element >= cur_ele){
                count += stack2.peek().minNumReplace;
                stack2.pop();
            }
            stack2.push(new Pair(cur_ele, count));
            right[i] = count;
        }
        long sum = 0;
        for (int i=0; i< arr.length; i++){
            sum = (sum + (long) left[i] *right[i]*arr[i])%m;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(sumSubArray(arr));

    }
}
