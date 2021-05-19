import java.util.Scanner;

public class RightMost_diffrent_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n -- >0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = x ^ y;
            if (a  == 0){
                System.out.println(-1);
            }
            int count=1;
            while ((a & 1) !=1){
               a = a >> 1;
                count++;
            }
            System.out.println(count);
        }
    }
}
