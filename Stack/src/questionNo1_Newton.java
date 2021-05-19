import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class questionNo1_Newton {
    //    public class stack{
//        protected int[] arr;
//        private int topIndxStack;
//        public static final int DEFAULT_CAPACITY=10;
//
//        stack(int capacity){
//            this.arr = new int[capacity];
//            this.topIndxStack = -1;
//        }
//        stack(){
//            this(DEFAULT_CAPACITY);
//        }
//        public int size(){
//            return this.topIndxStack + 1;
//        }
//        public boolean empty(){
//            return this.size() == 0;
//        }
//        public void push(int x)throws Exception{
//            if (this.topIndxStack == this.arr.length - 1){
//                throw new Exception("stack is already full");
//            }
//            this.topIndxStack++;
//            this.arr[this.topIndxStack] = x;
//        }
//        public int top()throws Exception{
//            if (this.empty()){
//                throw new Exception("stack is empty");
//            }
//            int topEle = this.arr[this.topIndxStack];
//            return topEle;
//        }
//        public int pop(){
//            int topEle = this.arr[this.topIndxStack];
//            this.topIndxStack--;
//            return topEle;
//        }
//
//    }


    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long test = Integer.parseInt(br.readLine());
        while (test -- > 0){
            String[] strArr = br.readLine().split(" ");

            long n = Long.parseLong(strArr[0]);
            long id = Long.parseLong(strArr[1]);

            long cur = id;
            long prev = 0;

            Stack<Integer> st = new Stack<>();


            for (long i = 0; i<n;i++){
                String[] s = br.readLine().split(" ");
                String pass = s[0];

                if (pass.equals("P")){
                    long playerId = Long.parseLong(s[1]);
                    prev = cur;
                    cur = playerId;
                }
                else {
                    long temp = prev;
                    prev = cur;
                    cur = temp;
                }
//                System.out.println(st.peek());
            }

        System.out.println(cur);
        }
    }
}
