import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class FLAMES {
    public static void main(String[] args) throws IOException {
        BufferedReader ipReader  = new BufferedReader(new InputStreamReader(System.in));
        String str1 = ipReader.readLine();
        String str2 = ipReader.readLine();


        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

//        for (int i=0; i<arr1.length;i++){
//            arr1[i] = 0;
//        }
//        for (int i=0; i<arr2.length;i++){
//            arr2[i] = 0;
//        }

        for(int i=0;i<str1.length();i++){
            arr1[str1.charAt(i)-97]++;
        }


//        for(int i=0;i<str2.length();i++){
//            arr2[str2.charAt(i)-97]++;
//        }
//        for(int i=0;i<26;i++){
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<26;i++){
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println();
        int sum= 0;
        for (int i = 0; i < 26; i++){
            if (arr2[i] - arr1[i] < 0){
                sum += arr1[i] - arr2[i];
            }else{
                sum += arr2[i] - arr1[i];
            }
        }
        if(sum%6==0){
            System.out.print("Siblings");
        }else if(sum%6==1){
            System.out.print("Friends");
        }else if(sum%6==2){
            System.out.print("Love");
        }else if(sum%6==3){
            System.out.print("Affection");
        }else if(sum%6==4){
            System.out.print("Marriage");
        }else {
            System.out.print("Enemy");
        }

    }
}
