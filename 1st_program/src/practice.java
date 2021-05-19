//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class practice {
//    public class BubbleSort {
//        public static void bubbleSort(int[] arr, int n){
//            boolean swapped;
//            for(int i =0; i<n-1; i++){
//                swapped = false;
//                for(int j =0; j<n-1-i; j++){
//                    if(arr[j] > arr[j+1]){ //swap
//                        int temp = arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1] =temp;
//                        swapped = true;
//                    }
//                }
//                //if there was no swap, that means array is already sorted
//                if(swapped == false){
//                    break;
//                }
//                for(int j =0; j<n; j++){
//                    System.out.print(arr[j] +", ");
//                }System.out.println();
//            }
//        }
//        public static void main(String[] args) {
//            int n=5;
//            int[] arr = {1,2,3,4,5};
//            for(int i =0; i<n; i++){
//                System.out.print(arr[i] +", ");
//            }
//            System.out.println();
//            bubbleSort(arr, n);
//            for(int i =0; i<n; i++){
//                System.out.print(arr[i] +", ");
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//    }
//
//}
