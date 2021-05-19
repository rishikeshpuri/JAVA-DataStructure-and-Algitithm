import java.util.Scanner;

public class arraySumMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr;
        arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(arr);
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        int sum =0;
        for (int i=0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        int avg =0;
        avg = sum/arr.length;
        System.out.println();
        System.out.print(sum + " ");
        System.out.println(avg);


    }
}
