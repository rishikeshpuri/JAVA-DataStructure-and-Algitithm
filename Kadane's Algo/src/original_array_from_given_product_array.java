import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class original_array_from_given_product_array {
    static void originalArr(int[] pair, int n) {
        int size = (1 + (int)Math.sqrt(1 + 8 * n)) / 2;
        int []arr = new int[size];

        // First element of the resulting array
        arr[0] = (int) Math.sqrt((pair[0] * pair[1]) / pair[size - 1]);

        // Find all the other elements
        for (int i = 1; i < size; i++) {
            arr[i] = pair[i - 1] / arr[0];
        }
        // Print the elements of the generated array
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] pairArr = new int[N];
            String[] strArr = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                pairArr[i] = Integer.parseInt(strArr[i]);
            }
            // Kadanes Algo
            originalArr(pairArr, N);
        }
    }
}