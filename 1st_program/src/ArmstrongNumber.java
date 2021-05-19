
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int len = String.valueOf(num).length();
//        System.out.println(len);
//
//        int temp;
//        double sum=0;
//        for (int i =0; i<len; i++){
//            temp = num % 10;
//            sum = sum + Math.pow(temp,len);
//            num = num /10;
//        }
//        System.out.println(sum);

        int N = sc.nextInt();
        int n, temp, sum=0;
        for (int i = 1; i<=N; i++){
//
            n=i;
            int count = 0;
            while (n>0){
                int len = String.valueOf(i).length();
                temp = n%10;

                sum =(sum+temp*temp*temp);
                n = n/10;
            }
            if (sum == i){
//                System.out.println("----------");
                System.out.println("Amstrong no is :" + i);
            }
            sum =0;
        }

    }
}
