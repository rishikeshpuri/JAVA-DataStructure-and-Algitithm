import java.util.Scanner;

public class Maximum_profit {
    public static long kadanesAlgo(int[] arr, int n){
        long maximumSum = Integer.MIN_VALUE;
        long curSum = 0;
        for (int i=1; i<n;i++){
            curSum = curSum+ arr[i];
            if (curSum > maximumSum){
                maximumSum = curSum;
            }
            if (curSum < 0){
                curSum=0;
            }
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n+1];

        while(x-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            for(int i=a;i<=b;i++) {
                arr[i]+=c;
            }

        }
        // Kadanes Algo
        System.out.println(kadanesAlgo(arr, arr.length));
    }
}
