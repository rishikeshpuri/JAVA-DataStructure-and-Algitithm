import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort_0s_1s_2s {
    public static void sort012(int[] arr, int n){
        int left = 0;
        int mid = 0;
        int right = n-1;
        while (mid <= right){
            if (arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
            else if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            }
            else {
                mid++;
            }

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test -- >0){
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(str[i]);
            }

            sort012(arr, n);
            for (int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
