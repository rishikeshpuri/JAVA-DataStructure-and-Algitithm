import java.util.Scanner;

public class NewtonCompetitionQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] notes = new int[]{500,200};
//        int amount = n;
//        int amount1 = n;
//        int[] noteCounter = new int[2];
        // int change=0;
        // int x=0;
//        for (int i=0;i<2; i++) {
//            if (amount >= notes[i]) {
//                noteCounter[i] = amount / notes[i];
//                amount = amount - noteCounter[i] * notes[i];
//            }
//        }
//        if ((amount1 % 500==0)||(amount1 % 200==0)||(amount1 % 100==0)){
//            amount=0;
//        }
//        else if  (amount1<=100){
//            amount = 200 - amount;
//        }
//        else if(amount1>200 & amount1<400){
//            amount = 400-amount1;
//        }
//        else if(amount1>400 & amount1<500){
//            amount = 500-amount1;
//        }
//        else if(amount1>500 & amount1<600){
//            amount = 600-amount1;
//        }
//
//        else if(amount > 100){
//            amount = 200- amount;
//        }
//        System.out.println(amount);
        long n = sc.nextLong();

        if(n<=200){

            System.out.print(200-n);

            return;

        }

        if(n<=400){

            System.out.print(400-n);

            return;

        }

        n=(100-n%100)%100;

        System.out.print(n);


    }
}
