import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int n, int low, int mid, int upper){
        int i = low;
        int j = mid+1;
        int[] temp = new int[n];
        int k = low;
        while (i<=mid && j<=upper){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;

            }
            else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        if (i  > mid){
            while (j <= upper){
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        else {
            while (i <= mid){
                temp[k] = arr[i];
                k++;
                i++;
            }
        }
        for (int x = low; x<=upper;x++){
            arr[x] = temp[x];
        }



    }
    public static void mergeSort(int[] arr, int n, int low, int upper){

        int mid=0;
        if (low < upper){
            mid = low + (upper-low)/2;
            mergeSort(arr, n, low, mid);
            mergeSort(arr,n,  mid+1, upper);
            merge(arr, n, low, mid, upper);
        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());
        while (test -- >0){
            int n = Integer.parseInt(br.readLine());
            String[] strArr = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i< n; i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }
            for (int i=0; i< n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            int low = 0;
            int upper = n-1;

            mergeSort(arr, n, low, upper);

            for (int i=0; i< n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
    }
}
