import java.util.Scanner;

public class Check_two_numbers_bit_rotations_each_other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        int totalBit = 32;
        if (x == y){
            System.out.println("Yes");
            return;
        }
        while (totalBit -- >0){
            long lastBit = x & 1;
            x = x >>1;
            x = x + (lastBit << 31);
            if (x == y){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
