import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort0_1 {
    public static void sort01(int[] arr, int n){
        int left = 0;
        int right = n-1;
        while (left<right){
            if (arr[left] == 1){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
            else {
                left++;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        sort01(arr, n);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
//        System.out.println();

    }
}
