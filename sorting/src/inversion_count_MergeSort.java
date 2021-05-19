import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//--------------------------------------------------
//CHECK ERROR IN BELOW CODE AND COMPARE TO DOWN DOWN CODE
//---------------------------------------------------
//public class inversion_count_MergeSort {
//    public static long counter(int [] arr,int start,int end){
//        if(start==end) return 0;
//
//        int mid=(start+end)/2;
//        int i=start;
//        int j=mid;
//        int k=0;
//        long swap=0;
//        int [] temp=new int[end-start+1];
//
//        while(i<mid && j<end){
//            if(arr[i]>arr[j]){
//                temp[k++]=arr[j++];
//                swap+=(mid-i);
//                System.out.println(i+"i mid"+mid);
//            }else {
//                temp[k]=arr[i];
//                k++;
//                i++;
//
//
//            }
//        }
//
//        while(i<mid){
//            temp[k]=arr[i];
//            k++;
//            i++;
//        }
//        while(j<end){
//            temp[k]=arr[j];
//            j++;
//            k++;
//        }
//
//
//        for ( i=start;i<end;i++) {
//
//            arr[i]=temp[i-start];
//
//
//
//        }
//
//        return swap;
//
//    }
//
//    public static long mergeSort(int[] arr, int start, int end){
//        if (start<end){
//            int mid = start+(end-start)/2;
//            long left = mergeSort(arr, start, mid);
//            long right = mergeSort(arr, mid, end);
//            long inv_count = counter(arr, start, end);
//            return left+right+inv_count;
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] strArr = br.readLine().split(" ");
//        int[] arr = new int[n];
//        for (int i=0; i< n; i++){
//            arr[i] = Integer.parseInt(strArr[i]);
//        }
//        System.out.println( mergeSort(arr,0,arr.length));
//
//    }
//}
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class inversion_count_MergeSort {
    public static void main (String[] args) throws IOException{
        // Your code here

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        int arr[]=new int[n];
        String str[]=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
            //System.out.println(arr[i]);

        }

        System.out.println(inversion(arr,0,arr.length));

    }

    public static long inversion(int [] arr,int start,int end){


        if(end-start>1){
            int mid=(start+end)/2;

            long left= inversion(arr,start,mid);
            long right= inversion(arr,mid,end);
            long inv= counter(arr,start,end);
            return left+right+inv;
        }

        return 0;

    }

    public static long counter(int [] arr,int start,int end){
        if(start==end) return 0;

        int mid=(start+end)/2;
        int i=start;
        int j=mid;
        int k=0;
        long swap=0;
        int [] temp=new int[end-start+1];

        while(i<mid && j<end){
            if(arr[i]>arr[j]){
                temp[k++]=arr[j++];
                swap+=(mid-i);
//                System.out.println(i+"i mid"+mid);
            }else {
                temp[k]=arr[i];
                k++;
                i++;


            }
        }

        while(i<mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<end){
            temp[k]=arr[j];
            j++;
            k++;
        }


        for ( i=start;i<end;i++) {

            arr[i]=temp[i-start];



        }

        return swap;

    }
}