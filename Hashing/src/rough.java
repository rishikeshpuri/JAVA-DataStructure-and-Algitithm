import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class rough {
    static int lenOfLongSubarr(int arr[], int n)
    {
        // unordered_map 'um' implemented as
        // hash table
        HashMap<Integer,
                Integer> um = new HashMap<Integer,
                Integer>();
        int sum = 0, maxLen = 0;

        // traverse the given array
        for (int i = 0; i < n; i++)
        {

            // consider '0' as '-1'
            sum += arr[i] == 0 ? -1 : 1;

            // when subarray starts form index '0'
            if (sum == 1)
                maxLen = i + 1;

                // make an entry for 'sum' if it is
                // not present in 'um'
            else if (!um.containsKey(sum))
                um. put(sum, i);

            // check if 'sum-1' is present in 'um'
            // or not
            if (um.containsKey(sum - 1))
            {

                // update maxLength
                if (maxLen < (i - um.get(sum - 1)))
                    maxLen = i - um.get(sum - 1);
            }
        }

        // required maximum length
        return maxLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[0]);

        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(lenOfLongSubarr(arr, n));
    }
}
