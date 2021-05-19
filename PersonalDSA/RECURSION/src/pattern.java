public class pattern {
    static void fun1(int n)
    {
        int i = 0;
        for (i = 0; i < n; i++)
            System.out.print(" * ");
        System.out.println();


        if (n > 1)
            fun1(n - 1);


        for (i = 0; i < n; i++)
            System.out.print(" * ");
        System.out.println();



    }
    public static void main(String[] args) {
        fun1(5);
    }
}
