import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Pairs_sum_divisible_by_k {
//    public static int  sumDivByK(int[] arr,int n,int k){
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        int rem = 0;
//        for (int i=0; i<n;i++){
//            rem = arr[i] % k;
//            if (mp.containsKey(rem)){
//                int temp = mp.get(rem);
//                mp.put(rem, temp+1);
//            }
//            else {
//                mp.put(rem, 1);
//            }
////            int oldFrequency = mp.getOrDefault(rem, 0);
////            mp.put(rem, oldFrequency+1);
//        }
////        System.out.println(mp);
//        int count = 0;
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//        for (int i=0; i<n; i++){
//            rem = arr[i] % k;
//
//            if (rem == 0){
//                int freq = mp.get(rem);
//                if (freq % 2 == 0) {
//                    count1 = freq;
////                    System.out.println(count);
//                }
//            }
//            else if (2 * rem == k){
//                int freq = mp.get(rem);
//                if (freq % 2 == 0) {
//                    count2 = freq;
////                    System.out.println(count);
//                }
//
//            }
//            else {
//                int freq = mp.get(rem);
//                int otherFreq = mp.getOrDefault(k - rem, 0);
//                if (freq ==otherFreq){
//                    count3 = freq;
////                    System.out.println(count);
//
//                }
//
//            }
//        }
//        count = count1+ count2+ count3;
//        return count;
//    }
    public static int  sumDivByK(int[] arr,int n,int k){
        int pair = 0;
        int compliment =0;
        int mod = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<n;i++){
            mod = arr[i] %k;
            if (k - mod == k){
                compliment = 0;
            }
            else {
                compliment = k - mod;
            }
//            compliment = k - mod == k ? 0 : k - mod;
            if (mp.containsKey(compliment)){
                pair+=mp.get(compliment);
                System.out.println(mp.get(compliment)+" "+pair);
            }
            if (mp.containsKey(mod)){
                mp.put(mod, mp.get(mod)+1);
            }
//            if (!mp.containsKey(mod)){
            else{
                mp.put(mod, 1);
            }
        }
        System.out.println(mp);
        return pair;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.println(sumDivByK(arr, n, k));

    }
}
