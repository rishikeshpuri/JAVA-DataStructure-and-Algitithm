import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextAlphabetElement {

    public static void nextElement(int n, char k, char[] arr){
        int start = 0;
        int end = n-1;
        char res = '#';
        while (start <= end){
            int mid = start + (end - start)/2;
            if (k == arr[mid]){
                start = mid +1;
            }
            else if (k > arr[mid]){

                start = mid+1;
            }
            else {
                res = arr[mid];
                System.out.println(res);
                end = mid-1;
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test -- >0){
            String[] stArr = br.readLine().split(" ");
            int n = Integer.parseInt(stArr[0]);
            String k = stArr[1];
            char c = k.charAt(0);

            String a  = br.readLine();
            char[] ch = a.toCharArray();

//            for (int i=0; i<n; i++){
//                System.out.print(ch[i]+" ");
//            }

            nextElement(n,c,ch);

        }

    }
}
