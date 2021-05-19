import java.util.Scanner;
import java.lang.StringBuilder.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long n1=0,n2=1,n3=0;
        for (long i=2;i<n;i++){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);

//        int[] arr = new int[(int) n];
//
//
//        int n1=0,n2=1,n3=0;
//        System.out.print(n1 + " "+ n2);
//
//        arr[0]=0;
//        arr[1]=1;
//        for (int i=2;i<n;i++){
//            n3 = n1+n2;
//            System.out.print(" " +n3);
//            n1=n2;
//            n2=n3;
//
//
//            arr[i]=n3;
//
//        }
//        System.out.println();
//        System.out.print(n3);
//        System.out.println();
//        System.out.println("Array");
//        for (int ele:arr){
//            System.out.print(ele+" ");
//        }
        System.out.println();

    }
}
