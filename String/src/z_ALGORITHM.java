import java.util.Scanner;

public class z_ALGORITHM {public static void calculateZarray(String str, int[] Z){
    int len = str.length();
    int left = 0;
    int right = 0;
    int k = 0;

    for(int i=1; i<len;i++){
        if(i > right){ // traverse
            left = right = i;
            while(right < len && str.charAt(right-left) == str.charAt(right)){
                right++;
            }
            Z[i] = right - left;
            right--;

        }
        else{// using earlier values
            k = i - left;
            if(Z[k] < (right-i+1)){ // Z[k] would not exceeding right
                Z[i] = Z[k];
            }
            else{
                left = i;
                while(right < len && str.charAt(right-left) == str.charAt(right)){
                    right++;
                }
                Z[i] = right - left;
                right--;
            }
        }
    }
}
    public static void checkPatternExists(String text, String patt){
        String str = patt +"$" + text;
        int len = str.length();
        int[] Z = new int[len];

        calculateZarray(str, Z);

        for (int i=0; i<len; i++){
            if (Z[i] == patt.length()){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        while (test -- >0){
            String text = sc.next();
            String patt = sc.next();
            checkPatternExists(text, patt);
        }
    }
}
