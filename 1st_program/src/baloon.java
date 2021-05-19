import java.util.Scanner;

public class baloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] Arr = new int[n];
        for (int i=0; i<n; i++){
            Arr[i] = sc.nextInt();
        }
        int hb=0;
        for (int i=0; i<n; i++){
            if (Arr[i]%2 ==0 && i%2==1){
                hb+=1;
            }
//            System.out.println(i);
            if (Arr[i]%2==1 && i%2==0){
                hb+=1;
//                System.out.println("-----");
//                System.out.println(i);
            }

        }
        System.out.println(hb);

    }
}
