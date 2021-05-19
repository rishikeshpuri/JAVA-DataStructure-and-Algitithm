import java.util.Scanner;

public class bubbleSort {

//    public static void bubble_sort(int[] arr, int n){
//        for (int i=0; i<n-1;i++){
//            for (int j=0; j<n-1-i; j++){
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
    public static void IMPROVED_bubble_sort(int[] arr, int n){
        boolean swapped;
        for (int i=0; i<n-1;i++){
            swapped= false;
            for (int j=0; j<n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
            for (int j=0; j<n; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0 ){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
//            bubble_sort(arr, n);
            IMPROVED_bubble_sort(arr, n);
            for (int i=0; i<n; i++){
                System.out.print(arr[i]+" ---");
            }
            System.out.println();

        }
    }
}
