import java.util.Scanner;

//Given a matrix of size N*N, your task is to find the sum of the upper triangular matrix and the lower triangular matrix.
public class Triangular_matrix {
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

        int upperTrianle = 0;
        int lowerTrianle = 0;

        for(int r=0; r<n; r++){
            for (int c=0; c<n; c++){
                if (c>=r){
                    upperTrianle+=arr[r][c];
                }
            }
        }
        for(int r=0; r<n; r++){
            for (int c=0; c<n; c++){
                if (r>=c){
                    lowerTrianle+=arr[r][c];
                }
            }
        }
        System.out.print(upperTrianle+ " ");
        System.out.print(lowerTrianle);


    }
}
