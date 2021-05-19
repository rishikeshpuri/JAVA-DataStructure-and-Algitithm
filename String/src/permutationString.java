import java.util.Arrays;
import java.util.Scanner;

public class permutationString {

//-----------------WITHOUT LEXICOGRAPHIC WAY IT'S SIMPLE PERMUTATION PRINT-------------------'

//    public static String swap (String str, int a, int b) {
//        char temp;
//        char[] arr = str.toCharArray();
//        temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//        return String.valueOf(arr);
//    }
//
//    public static String permute (String str, int l, int r) {
//        if(l == r){
////            System.out.print(str+" ");
//            return str ;
//        }
//        else{
//            for(int i =l; i<=r; i++){
//                str = swap(str, i, l);
//                permute(str, l+1, r);
//                str = swap(str, i, l);
//            }
//
//        }return str;
//    }
    //    public static String swap (String str, int a, int b) {
//        char temp;
//        char[] arr = str.toCharArray();
//        temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//        return String.valueOf(arr);
//    }

//    -----------------------EFFICIENT WAY IN LEXICOGRAPHIC WAY---------------------


    public static void permutation (String input, String output) {
        if (input.equals("")){
            System.out.print(output+" ");
            return;
        }
        for(int i = 0; i<input.length();i++){
            char ch = input.charAt(i);
            String ros = input.substring(0,i) + input.substring(i+1);
            permutation(ros, output+ch);
        }

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        permutation(str, "");
    }
}
