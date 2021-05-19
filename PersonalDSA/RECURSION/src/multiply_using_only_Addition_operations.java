public class multiply_using_only_Addition_operations {
    static int  Multiply_by_recursion(int M, int N)
    {
        if (M < N) {
            return Multiply_by_recursion(N, M);
        }
        else if (N != 0){
            return (M + Multiply_by_recursion(M, N - 1));
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(Multiply_by_recursion(3,4));
    }
}
