import java.util.Scanner;
public class DiagonalSum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                arr[r][c] = sc.nextInt();
            }
        }
//        for(int r=0; r<n; r++){
//            for(int c=0; c<n; c++){
//                System.out.print(arr[r][c] + " ");
//            }
//            System.out.println();
//        }
//        int primaryDiagonal = 0;
//        int secondaryDiagonal = 0;
//        for(int r=0; r<n; r++){
//            for(int c=0; c<n; c++){
//                if (r==c){
//                    primaryDiagonal+=arr[r][c];
//                }
//            }
//        }
//        System.out.print(primaryDiagonal+ " ");
//        for(int r=0; r<n; r++){
//            for(int c=0; c<n; c++){
//                if (r+c == n-1){
//                    secondaryDiagonal+=arr[r][c];
//                }
//            }
//        }
//        System.out.print(secondaryDiagonal);

//        MORE EFFICIENT WAYYYY


        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for(int r=0; r<n; r++){
            primaryDiagonal+=arr[r][r];
            }
        System.out.print(primaryDiagonal + " ");

        int col=n-1;
        for (int r=0; r<n; r++){
            secondaryDiagonal+=arr[r][col];
            col--;
        }
        System.out.print(secondaryDiagonal);

    }
}
