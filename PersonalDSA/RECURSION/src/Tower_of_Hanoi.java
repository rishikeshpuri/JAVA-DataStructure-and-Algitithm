import java.util.Scanner;
public class Tower_of_Hanoi {
    public static void hanoi(int disc, String a, String b, String c){
        if (disc == 0){
            return;
        }
        hanoi(disc-1, a, c , b);
        System.out.println(disc +":"+a +"->"+c);
        hanoi(disc-1,b, a, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n,"A", "B", "C");
    }
}
