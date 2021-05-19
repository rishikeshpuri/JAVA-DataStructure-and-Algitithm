import java.util.Scanner;

public class SelectionSort {

//    public static void selectionSort(int[] arr, int n){
//        for (int i=0; i<n-1; i++){
//            int min = i;
//            for (int j=i+1; j<n; j++){
//                if (arr[j] < arr[min] ){
//                    min = j;
//                }
//            }
//            if (min != i){
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//            }
//        }
//    }
public static void ImproveSelectionSort(int[] arr, int n){
    for (int i=0; i<n-1; i++){
        int min = i;
        for (int j=i+1; j<n; j++){
            if (arr[j] < arr[min] ){
                min = j;
            }
        }
        int key = arr[min];
        for (int k= min-1; k>=i; k--){
            arr[k+1] = arr[k];
        }
        arr[i] = key;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
//            selectionSort(arr, n);
            ImproveSelectionSort(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }
}
