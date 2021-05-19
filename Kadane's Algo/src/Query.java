import java.util.Scanner;

public class Query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N];
        int[] freqArr = new int[100001];
//        so
        for (int i=0; i<N;i++){
            int x = sc.nextInt();
            arr[i] = x;
            freqArr[x]++;
        }
        // cumulative/ contiguous sum
        for (int i=1; i<=100000;i++){
            freqArr[i] = freqArr[i] + freqArr[i-1];
        }

        for (int i=1; i<=Q; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            System.out.println(freqArr[R] - freqArr[L-1]);
        }

    }
}
