import java.util.Scanner;

public class GoodCells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        int count=0;
        for (int r=1; r<row-1; r++){

            for (int c=1; c<col-1; c++){
                if (arr[r-1][c]==1 && arr[r][c-1]==1 && arr[r+1][c]==1 && arr[r][c+1]==1){
//                    System.out.println(r+ ","+c+": "+arr[r][c]);
                    count+=1;
//                    System.out.println(count);
                }
            }

        }
        System.out.println(count);


//        for(int r=0; r<row; r++){
//            for(int c=0; c<col; c++){
//                System.out.print(arr[r][c] + " ");
//            }
//            System.out.println();
//        }
//
    }
}
