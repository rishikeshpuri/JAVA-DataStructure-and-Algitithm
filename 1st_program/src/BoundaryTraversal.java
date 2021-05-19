import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoundaryTraversal {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(rd.readLine());

        for (int i=0; i<N;i++) {

            String[] rowcol = rd.readLine().split(" ");
            int rows = Integer.parseInt(rowcol[0]);
            int cols = Integer.parseInt(rowcol[1]);

            int[][] arr = new int[rows][cols];
            int sum=0;

            for (int r=0; r<rows; r++){
//                String[] rows
                for (int c=0; c<cols; c++){
                    sum += 1;
                    arr[r][c] = sum;
                }
            }

//            for (int r=0; r<rows; r++){
//                for (int c=0; c<cols; c++){
//                    System.out.print(arr[r][c]+" ");
//                }
//                System.out.println();
//            }
            System.out.println("---------------------------");
            for (int r=0; r<rows; r++){
                for (int c=0; c<cols; c++){
                    System.out.print(arr[r][c]+" ");
                }
//                System.out.println();
            }


        }
        }
}
