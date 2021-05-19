import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class matrix_element_Sorted_RowColumn {
    public static boolean matrixElement(int rows, int cols, int q, int[][] arr){
        int i=0;
        int j=cols-1;
//        boolean res = true;
        while (i >=0 && i< rows && j>0 && j< cols){
            if (arr[i][j] == q){
                return true;
            }
            else if (arr[i][j] > q){
                j--;
            }
            else if (arr[i][j] < q){
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String[] rowcol = br.readLine().split(" ");
        int rows = Integer.parseInt(rowcol[0]);
        int cols = Integer.parseInt(rowcol[1]);
        int query = Integer.parseInt(rowcol[2]);

        int[][] arr = new int[rows][cols];

        for (int r=0; r<rows; r++){
            String[] rowsNo = br.readLine().split(" ");
            for (int c=0; c<cols; c++){
                arr[r][c] = Integer.parseInt(rowsNo[c]);
            }
        }
        for (int r=0; r<rows; r++){
            for (int c=0; c<cols; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        while (query -->0){
            int q = Integer.parseInt(br.readLine());
//            System.out.println(matrixElement(rows, cols, q, arr));
            boolean result = matrixElement(rows, cols, q, arr);
            if (result){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }



    }
}
