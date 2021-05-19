import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transpose {
    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(rd.readLine());

        int[][] arr= new int[N][N];

//        for (int r=0; r<N; r++){
//            String[] row = rd.readLine().split(" ");
//            for (int c=0; c<N; c++){
//                arr[r][c] = Integer.parseInt(row[c]);
//            }
//        }
        for (int r=0; r<N; r++){
            for (int c=0; c<N; c++){
                arr[r][c] = r+c;
            }
        }

//        for (int r=0; r<N; r++){
//            for (int c=0; c<N; c++){
//                System.out.print(arr[r][c]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("---------");
//        System.out.println("-------");
        for (int r=0; r<N; r++){
            for (int c=0; c<r; c++){
                int temp = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = temp;
            }
        }
        for (int r=0; r<N; r++){
            for (int c=0; c<N; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }



        }
}
