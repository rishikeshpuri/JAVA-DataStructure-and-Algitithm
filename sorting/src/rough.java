import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rough {
    public static void main(String[] args) throws IOException {
        String str = "a b c d";
        char[] ch = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            int x = ch[i];
            System.out.print(x+" ");
        }
    }
}
