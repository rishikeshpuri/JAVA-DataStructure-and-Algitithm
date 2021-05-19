import java.util.Scanner;
import java.util.Arrays;
public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        int count, minRepElement=0;
//        long least=99999;
//        for (int i=0;i<arr.length;i++){
//            count=1;
//            for (int j=0;j<arr.length;j++){
//                if (i!=j && arr[i] ==arr[j]){
//                    count+=1;
//                }
//            }
//            if (least > count){
//                least = count;
//                minRepElement=arr[i];
//            }
//            }
//        System.out.println(least + "--"+ minRepElement);
//        Arrays.sort(arr);
//        for (int i=0;i<arr.length;i++) {
//            if(arr[i] != arr[i+1]){
//                System.out.println(arr[i]);
//            }
//
//        }
        int count;
        for(int i=0; i<arr.length;i++){
            count=0;
            for (int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count+=1;
                }
            }
            if (count==1){
                System.out.println(arr[i]);
            }
        }


}}
