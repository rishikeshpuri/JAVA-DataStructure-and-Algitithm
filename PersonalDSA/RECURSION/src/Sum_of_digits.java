public class Sum_of_digits {
    static long  Sum(long  n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + Sum(n / 10));
    }
    public static void main(String[] args) {
        System.out.println(Sum(25));
    }
}
