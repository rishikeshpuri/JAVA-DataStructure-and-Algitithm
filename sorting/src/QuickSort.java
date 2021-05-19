import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i =start;
        int endIdx = end-1;

        while (i <= endIdx){
            if (arr[i] > pivot){
                int temp = arr[i];
                arr[i] = arr[endIdx];
                arr[endIdx] = temp;
                endIdx --;
            }
            else {
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
//    public static int partition(int[] arr, int lb, int ub){
//        int start = lb;
//        int end = ub;
//        int pivot = arr[lb];
//        while (start < end){
//            while (arr[start] <= pivot){
//                start++;
//            }
//            while (arr[end] > pivot){
//                end--;
//            }
//            if (start < end){
//                int temp = 0;
//                temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//            }
//        }
//        int temp = 0;
//        temp = arr[end];
//        arr[end] = arr[lb];
//        arr[lb] = temp;
//        return end;
//    }
    public static int[] quickSort(int[] arr, int start, int end){
        if (start < end){
            int location = partition(arr, start, end);
            quickSort(arr, start, location-1);
            quickSort(arr, location+1, end);
        }
        return arr;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int start = 0;
        int end = n-1;
        quickSort(arr, start, end);
        System.out.println();
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }
}
