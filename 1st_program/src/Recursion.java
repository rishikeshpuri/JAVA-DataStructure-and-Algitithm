public class Recursion {

    static int Factorial(int n){
        if (n == 0 || n==1){
            return 1;
        }
        else {
            return n *Factorial(n-1);
        }

    }

    public static void main(String[] args) {
        int x=4;
        System.out.println(Factorial(x));
    }
}
