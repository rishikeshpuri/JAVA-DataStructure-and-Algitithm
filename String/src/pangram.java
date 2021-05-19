import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class pangram {
    public static boolean pangramEnglish(String str){

        boolean[] arr = new boolean[26];

        int index=0;
        for (int i = 0; i < str.length(); i++) {
//            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
//                index = str.charAt(i) - 'A';
//            }
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a';
//                arr[str.charAt(i)-'a'] = true;
            }
            else {
                continue;
            }
            arr[index] = true;
        }
        for (int i = 0; i < 26; i++)
            if (arr[i] == false) {
                return false;
            }
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String str = br.readLine();
            str = str.toLowerCase(Locale.ROOT);
            System.out.println(str);
            boolean res =  pangramEnglish(str);
            if (res){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
