import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }

            System.out.println();
        }
        for (int k=n; k>=1;k--){
            for (int  j=1; j<=k;j++){
                System.out.print(j+ " ");
            }
            for (int x=k-1;x>=1;x--){
                System.out.print(x+" ");
            }
        System.out.println();
        }

    }
}
