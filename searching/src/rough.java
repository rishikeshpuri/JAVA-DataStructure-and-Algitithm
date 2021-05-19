// Java program to find minimum time
// required to produce m items.
import java.io.*;

public class rough{

    // Return the minimum time required to
// produce m items with given machines.
    static int findItems(long[] arr, long n,
                         long temp)
    {
        int ans = 0;
        for (int i = 0; i < n; i++)
            ans += (temp / arr[i]);
        return ans;
    }

    // Binary search to find minimum time
// required to produce M items.
    static int bs(long []arr, long n,
                  long m, int high)

    {
        int low = 1;

        // Doing binary search to
        // find minimum time.
        while (low < high)
        {
            // Finding the middle value.
            int mid = (low + high) >> 1;

            // Calculate number of items to
            // be produce in mid sec.
            int itm = findItems(arr, n, mid);

            // If items produce is less than
            // required, set low = mid + 1.
            if (itm < m)
                low = mid + 1;

                // Else set high = mid.
            else
                high = mid;
        }

        return high;
    }

    // Return the minimum time required to
// produce m items with given machine.
    static int minTime(long []arr, long n,
                       long m)
    {
        int maxval = Integer.MIN_VALUE;

        // Finding the maximum time in the array.
        for (int i = 0; i < n; i++)
            maxval = (int) Math.max(maxval, arr[i]);

        return bs(arr, n, m, (int) (maxval * m));
    }
    static public void main (String[] args)throws IOException
    {
//        int []arr = { 1, 2, 3,4 };
//        int n = arr.length;
//        int m = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int test = Integer.parseInt(br.readLine());
        String[] stArr = br.readLine().split(" ");
        long n = Long.parseLong(stArr[0]);
        long m = Long.parseLong(stArr[1]);

        String[] a = br.readLine().split(" ");
        long[] arr = new long[(int) n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(a[i]);
        }

        System.out.println(minTime(arr, n, m));
    }
}

// This code is contributed by vt_m.
