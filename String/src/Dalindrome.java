import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dalindrome {
    public static boolean palindrome(String str, int start, int end){
        for (int i = start; i<end; i++){
            if (str.charAt(i)!= str.charAt(end-1-i)){
                if (i+1 == end){
                    return false;
                }
                return palindrome(str, i, end-1);

            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n =str.length();
        int flag=0;
        for(int start=0; start<n; start++)
        {
            if(palindrome(str, start, n))
            {
                System.out.print("Yes");
                flag=1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.print("No");
        }
    }
}
