import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int i=0;
//        int rev=0, num;
        int len = String.valueOf(n).length();
        String str = String.valueOf(n);
//
//        int temp=n;
//        for (int i=0; i<len; i++){
//            num = temp%10;
//            rev = rev*10 + num;
//            temp = temp/10;
//        }
//        if (n == rev){
//            System.out.println(1);
//        }
//        else {
//            System.out.println(0);
//        }
        boolean isPalindrome = true;
        for (int i=0; i<len/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println(0);
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println(1);
        }

    }
}


