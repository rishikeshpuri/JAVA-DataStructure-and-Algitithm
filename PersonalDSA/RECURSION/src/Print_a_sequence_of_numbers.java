public class Print_a_sequence_of_numbers {
    static void printPattern(int n,int curr)
    {
        if (curr<=0){
            System.out.print(curr+" ");
            return;
        }
        System.out.print(curr+" ");
        printPattern(n, curr-5);
        System.out.print(curr+" ");
    }
    public static void main(String[] args) {
        printPattern(16,10);
    }
}
