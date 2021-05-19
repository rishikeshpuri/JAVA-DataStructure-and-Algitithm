import java.util.Arrays;
import java.util.Scanner;

public class divisorBy2 {
    public static int divisor(int n){
        if (n%2 !=0){
            return 0;
        }
        int count=0;
//        int x =(int) Math.sqrt(n/2);
        int[] arr= new int[n];
        for (int i =0; i<= n; i++){
            if (n%2 == 0 || n%2==1){
                count+=1;
                arr[i] = 2;
                n=n/2;
            }

        }
        for (int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int test = Integer.parseInt(br.readLine());

        while (test-- >0){
            int n = sc.nextInt();
            System.out.println(divisor(n));

        }
    }
}
