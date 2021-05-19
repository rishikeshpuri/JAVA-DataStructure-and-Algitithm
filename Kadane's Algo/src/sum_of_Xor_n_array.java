import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum_of_Xor_n_array {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        String[] strArr = br.readLine().split(" ");
        for (int i=0; i<N;i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        long count=0;
        long sum=0;

        for(int i=arr.length-1;i>=0;i--){
            count=count^arr[i];
            sum+=count;

        }
        System.out.println(sum);

    }
}
