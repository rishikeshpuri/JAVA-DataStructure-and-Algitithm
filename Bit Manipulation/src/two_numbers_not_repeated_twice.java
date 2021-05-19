import java.util.Scanner;

public class two_numbers_not_repeated_twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = (n *2) + 2;
        long[] arr = new long[N];
        long xorTotal = 0;
        for (int i=0; i < N; i++){
            arr[i] = sc.nextInt();
            xorTotal = xorTotal ^ arr[i];
        }
        long rightMostSetBitPosition = 0;
        long x = xorTotal;
        while (x > 0){
            long lasyBit = x & 1;
            if (lasyBit == 1){
                break;
            }
            x = x >> 1;
            rightMostSetBitPosition++;
        }
        long a = 0;// store unset value
        long b = 0; // store set value
        for (int i=0; i<N;i++){
            long y = arr[i];
            long setBit = (y >> rightMostSetBitPosition) & 1;
            if (setBit == 0){
                a = a ^ arr[i];
            }
            else {
                b = b ^ arr[i];
            }

        }
        if (a < b){
            System.out.println(a +" "+b);
        }
        else {
            System.out.println(b +" "+ a);
        }
    }
}
