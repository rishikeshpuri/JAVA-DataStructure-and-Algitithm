import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MthPowerPrime {
    public static boolean Prime(int n){
        if(n<=1) return false;
        for (int i=2; i*i<=n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        while (test-- >0){
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int count=0;
//            int[] arr = new int[n/2];
//            for (int i =0; i*i<=n; i++){
//
//                if (Prime(i)){
////                    System.out.print(i+" ");
//                    int x = (int)Math.pow(i, m);
//                    if (n == x){
//                        arr[i] = 1;
//                    }
//                    else {
//                        arr[i] = 0;
//                    }
//                }
//            }
//            for (int i =0; i<arr.length; i++){
//                if (arr[i] in "Yes"){
//
//                }
//
//            }
//        }
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(rd.readLine());
        while(t-->0){
            String b[]=rd.readLine().split(" ");
            int n=Integer.parseInt(b[0]);
            int m=Integer.parseInt(b[1]);
            if(m==1){
                int a=(int)Math.sqrt(n);
                int p=1;
                for(int k=2;k<=a;k++){
                    if(n%k==0){
                        p=0;
                        break;
                    }
                }
                if(p==1)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else{
                for(int i=2;i<=n/2;i++){
                    int a=(int)Math.sqrt(i);
                    int p=1;
                    for(int j=2;j<=a;j++){
                        if(i%j==0){
                            p=0;
                            break;}
                    }
                    if(p==1){
                        if((int)Math.pow(i,m)==n){
                            System.out.println("Yes");
                            break;}
                        else if((int)Math.pow(i,m)>n){
                            System.out.println("No");
                            break;
                        }
                    }
                }
            }}


    }
}
