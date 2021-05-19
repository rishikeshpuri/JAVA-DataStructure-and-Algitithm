import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        StringBuilder s = new StringBuilder();
        while (n > 0){
            long rem = n % 9;
            s.append(rem);
            rem = n / 9;
            n = rem;
        }
        s = s.reverse();
//        System.out.println(s);
        while (s.length() > 0 && s.charAt(s.length() - 1) == '0') {
            s.setLength(s.length() - 1);
        }
        System.out.println(s.toString());


//        String[] strArr = br.readLine().split(" ");
//        int[] arr = new int[n];
//        for (int i=0; i<n;i++){
//            arr[i] = Integer.parseInt(strArr[i]);
//        }
//        int count = 0;
//        for (int i=0; i<n-2;i++){
//            if (arr[i] == arr[i+1] && arr[i] == arr[i+2]){
//                count++;
//            }
//        }
//        if (count > 0){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
    }
}
