import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Anagram_Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strArr = br.readLine().split(" ");

        HashMap<String, List<String>> mp = new HashMap<>();

        for (int i=0; i<n; i++){
            String str = strArr[i];
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
//            System.out.println(sortedStr);
            if (mp.containsKey(sortedStr)){
                mp.get(sortedStr).add(str);
            }
            else {
                List<String> valueList = new ArrayList<>();
                valueList.add(str);
                mp.put(sortedStr, valueList);
            }

        }
        System.out.println(mp);

        int q = Integer.parseInt(br.readLine());
        while(q-->0){
            String s = br.readLine();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if (mp.containsKey(str)){
                List<String> anagramList = mp.get(str);
                Collections.sort(anagramList);
                for (int i=0; i < anagramList.size(); i++){
                    System.out.print(anagramList.get(i)+" ");
                }
                System.out.println();
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
