import java.util.*;
public class _2D_array {
    public static void main(String[] args) {
//        int[][] arr = new int[5][4];
//        for (int r=0; r<5;r++){
//            for (int c=0; c<4;c++){
//                arr[r][c] = 10*r+c;
//            }
//        }
//
//        for(int r=0; r<5; r++){
//            for (int c=0; c<4; c++){
//                System.out.print(r + ","+ c +": "+arr[r][c]+"  ");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int r=0; r<n;r++){
            for (int c=0; c<m; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        for (int r=0; r<n; r++){
            for (int c=0; c<m; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }



    }
}
