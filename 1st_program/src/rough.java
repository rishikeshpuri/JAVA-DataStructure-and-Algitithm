import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class rough{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0; i<test; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][] arr = new int[m][n];
            for (int r=0; r<m; r++){
                for (int c=0; c<n; c++){
                    arr[r][c]=sc.nextInt();
                }
            }
            if (m == 1){
                for (int c=0; c<n;c++){
                    System.out.print(arr[0][c]+" ");
                }
            }
            else if (n == 1){
                for (int r=0; r<m;r++){
                    System.out.print(arr[r][0]+" ");
                }
            }
            else{
                for (int c = 0; c < n; c++) {
                    System.out.print(arr[0][c] + " ");
                }
                for (int r = 1; r < m - 1; r++) {
                    System.out.print(arr[r][n - 1] + " ");
                }
                for (int c = n; c > 0; c--) {
                    System.out.print(arr[m - 1][c - 1] + " ");
                }
                for (int r = m - 1; r > 1; r--) {
                    System.out.print(arr[r - 1][0] + " ");
                }
            }

            System.out.println();
        }

    }
}