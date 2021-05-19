import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompressString {
//    public static void compress(String str){
//        for (int i=0; i<str.length();i++){
//            int count=0;
//            int maxcount = -1;
//
//            for (int j=0; j<str.length();j++){
//                if (str.charAt(i) == str.charAt(j)){
//                    count++;
//                }
//                if (count>maxcount){
//                    maxcount=count;
//                }
//
//            }
//            i = i+maxcount-1;
//            System.out.print(str.charAt(i)+""+maxcount);
//
//        }
//    }
//    public static void compress(String str){
//        int count=0;
//        char ch = str.charAt(0);
//        for (int i=0; i<str.length();i++){
//            if (str.charAt(i) == ch){
//                count = count+1;
//            }
//            else {
//                System.out.print(ch +""+ count);
//                count = 1;
//                ch = str.charAt(i);
//            }
//        }
//        System.out.print(ch +""+ count);
//    }
    public static void compress(String str){
        int count=0;
//        char ch = str.charAt(0);
        char ch = 'A';
        int max = 0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i) == ch){
                count = count+1;
            }
            else {
                System.out.print(ch +""+ count);
                count = 1;
                ch = str.charAt(i);
            }
        }
        System.out.print(ch +""+ count);

    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        while (n-- > 0) {
//            String str = br.readLine();
//            compress(str);
//        }
        String str1 = br.readLine();
        compress(str1);
    }
}
