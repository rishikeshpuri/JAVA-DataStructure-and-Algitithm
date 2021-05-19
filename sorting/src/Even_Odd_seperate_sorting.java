import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Even_Odd_seperate_sorting {
    public static void sortEvenOdd(Integer[] arr, int n){
//        Arrays.sort(arr);
        int mid = n/2;
        int left = 0;
        int right = n-1;
        int k =0;
        while (left <= right){
            if (arr[left] %2 ==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
//                System.out.println(arr[left]);
            }
            else {
                left++;
                k++;
            }
        }
//        System.out.println(k);
        Arrays.sort(arr, 0, k, Collections.reverseOrder());
//        Arrays.sort(arr, k, n);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        sortEvenOdd(arr, n);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
