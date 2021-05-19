import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class AlternateMatrixAddition {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [][] arr = new int[n][n];
//
//        for(int r=0; r<n; r++){
//            for(int c=0; c<n; c++){
//                arr[r][c] = sc.nextInt();
//            }
//        }
//        int add=0;
//        int add1=0;
//        for (int r=0; r<n; r++){
//            for (int c=0; c<n; c++){
//                if ((r+c)%2 == 0){
////                    System.out.println(r+ ","+c+": "+arr[r][c]);
//                    add = add + arr[r][c];
//                }
//                else{
//                    add1 = add1 + arr[r][c];
//                }
//
//            }
//
//        }


//        Scanner sc = new Scanner(System.in);
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(inp.readLine());


        int [][] arr = new int[n][n];

        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                arr[r][c] = Integer.parseInt(String.valueOf(inp.read()));
            }
        }
        int add=0;
        int add1=0;
        for (int r=0; r<n; r++){
            for (int c=0; c<n; c++){
                if ((r+c)%2 == 0){
//                    System.out.println(r+ ","+c+": "+arr[r][c]);
                    add = add + arr[r][c];
                }
                else{
                    add1 = add1 + arr[r][c];
                }

            }

        }
        System.out.println(add);
        System.out.println(add1);


//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long black = 0, white = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                long x = in.nextInt();
//                if ((i + j) % 2 == 0) {
//                    black += x;
//                } else {
//                    white += x;
//                }
//            }
//        }
//        System.out.println(black);
//        System.out.print(white);
    }
}
