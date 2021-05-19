import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(rd.readLine());

        for (int i=0; i<N;i++){

            String[] rowcol = rd.readLine().split(" ");
            int rows = Integer.parseInt(rowcol[0]);
            int cols = Integer.parseInt(rowcol[1]);

            int[][] arr = new int[rows][cols];

            for (int r=0; r<rows; r++){
                String[] rowsNo = rd.readLine().split(" ");
                for (int c=0; c<cols; c++){
                    arr[r][c] = Integer.parseInt(rowsNo[c]);
                }
            }
//            System.out.println();
//            for (int r=0; r<rows; r++){
//                for (int c=0; c<cols; c++){
//                    System.out.print(arr[r][c]+" ");
//                }
//                System.out.println();
//            }


            for (int r=0; r<rows; r++){
                for (int c=0; c<cols; c++){
                    if (arr[r][c]==1){
                        arr[r][0]=1;
                        break;
                    }
                }
            }
            for (int r=0; r<rows; r++){
                if (arr[r][0]==1){
                    for (int c=0; c<cols; c++){
                        arr[r][c] = 1;
                    }
                }

            }
//            System.out.println();
            for (int r=0; r<rows; r++){
                    for (int c=0; c<cols; c++){
                        System.out.print(arr[r][c]+" ");
                    }
                System.out.println();
                }

            }

        }

    }

