import java.util.Scanner;

public class practice_Array {
    public static void main(String[] args) {
//          float [] a = {1.0f,2.0f,3.0f,4.0f};
//          float sum=0;
////          for (int i=0; i<a.length;i++){
////              sum = sum + (a[i]);
////          }
//        for (float ele: a){
//            sum+=ele;
//        }
//        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] a = {1,2,3,4,5};
//        int sum=0;
//        for (int i=0;i<a.length;i++){
//            sum = sum+a[i];
//        }
//        int avg = sum/a.length;
//        System.out.println(avg);

//        int [][] arr;
//        int [][] arr1;
//        arr = new int[2][3];
//        arr1 = new int[2][3];
//        arr[0][0] = 100;
//        arr[0][1] = 101;
//        arr[0][2] = 102;
//        arr[1][0] = 200;
//        arr[1][1] = 201;
//        arr[1][2] = 202;
//
//        arr1[0][0] = 100;
//        arr1[0][1] = 101;
//        arr1[0][2] = 102;
//        arr1[1][0] = 200;
//        arr1[1][1] = 201;
//        arr1[1][2] = 202;
//
//        int [][] sum;
//        sum = new int[2][3];
//
//        for (int i=0; i<arr.length;i++){
//            for (int j=0; j<arr[i].length;j++){
//                sum[i][j] = arr[i][j]+arr1[i][j];
//                System.out.print(sum[i][j]+ " ");
//            }
//            System.out.println();
//
//        }
//        int [] arr = {1,2,3,4,5,6};
//
//        int mid = Math.floorDiv(arr.length, 2);
//        for(int i=0;i<mid;i++){
//            // swap
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//        for (int ele : arr){
//            System.out.print(ele+ " ");
//        }

        int [] arr = {1,2,3,55,4,5,6};
        int ele = 0;
        int maxEle=1;
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    ele = arr[i];
                }
            if (ele > maxEle) {
                maxEle = ele;
            }
            }
        }
        System.out.println(maxEle);



    }
}
