import java.util.Scanner;

public class doctorClinic {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int T=10;
//        int N,X;
////        1 <= T <= 100
////        0 <= N <= 100
////        0 <= X <= 30
////
//        for (int i=0; i<n;i++){
//            N = sc.nextInt();
//            X = sc.nextInt();
//            if ((N>=0 & N<=100)&(X>=0 & X<=30)){
//                System.out.println((N-1)*(T-X));
//            }
//        }

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int N=sc.nextInt();
            int X=sc.nextInt();
            if(N==0){
                System.out.println(0);
            }
            else if(X>10){
                System.out.println(0);
            }
            else {
                int t = ((10 * (N - 1)) - (X * (N - 1)));
                if(t>0){ System.out.println(t);
                } else{
                    System.out.println(0);
                }


            }
            T=T-1;
         }

    }
}

