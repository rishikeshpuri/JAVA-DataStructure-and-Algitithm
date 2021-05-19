import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class rough {

    static String minLexRotation(String str) {
        int n = str.length();
        String arr[] = new String[n];
        String concat = str + str;
        for (int i = 0; i < n; i++) {
            arr[i] = concat.substring(i, i + n);
        }
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x=0;
        int y=0;
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if (n < 26){
            x = n % 26;

        }
        else if (n == 26){
            x = n;
        }
        else {
            x = n / 26;
            System.out.println(x);
            y = n % 26;
            System.out.println(y);
        }
        System.out.println();

        String s = "";

        if (n <= 26){
            for (int i=0; i<x;i++){
                s = s + c[i];
//                s.append(c[i]);
                System.out.print(c[i]);
            }
        }
        else {
            for (int i=0; i<x;i++){
                s += str;
//                s.append(str);
                System.out.print(str);
            }
            for (int i=0; i<y;i++){
                s += c[i];
//                s.append(c[i]);
                System.out.print(c[i]);
            }
        }
        System.out.println();
        System.out.println(s);
        System.out.println(minLexRotation(s));

//        System.out.print(str.repeat(n));
//        if (n <= 26){
//            for (int i=1; i<n;i++){
//                System.out.print(c[i]);
//            }
//        }
//        else {
//            for (int i=0; i<n;i++){
//                System.out.print(c[i]);
//            }
//        }

    }
}
