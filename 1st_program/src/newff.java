import java.util.Scanner;

public class newff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2= sc.nextInt();
        int y2= sc.nextInt();

        if (x1==x2){
            if (y1>y2){
                System.out.println("South");
            }
            if (y2>y1){
                System.out.println("North");
            }
        }
        if (y1==y2){
            if (x1>x2){
                System.out.println("West");
            }
            if (x2>x1){
                System.out.println("East");
            }
        }
        if (x2 >x1){
            if (y2>y1){
                System.out.println("North East");
            }
            if (y1>y2){
                System.out.println("South East");
            }
        }


        if (x1 >x2){
            if (y2>y1){
                System.out.println("North West");
            }
            if (y1>y2){
                System.out.println("South West");
            }
        }



//        if (n == 0){
//            System.out.println("Yes");
//        }
//        else if (m == 0){
//            System.out.println("No");
//        }
//
//        else if (n%m == 0){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//        int nCandy=0;
//        int person=0;
//        while (nCandy>=m){
//            ++person;
//            nCandy=nCandy-m;
//        }
//        System.out.println(nCandy + " "+ person);
    }
}
