import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
//        int num;
//        System.out.println("Enter a number to get odd no: ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        for (int i=1; i<=num; i++){
//            if(i %2!=0){
//                System.out.println("odd Number : "+ i);
//            }
//        }
//        for (int i =5; i > 0; i--){
//            System.out.println(i);
//        }
//        System.out.println("-----");
//        for (int i =5; i > 0; --i){
//            System.out.println(i);

//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to print reverse order");
        int n = sc.nextInt();
        for (int i=n; i>0; i--){
            System.out.println(i);
//            break;
        }

    }
}
