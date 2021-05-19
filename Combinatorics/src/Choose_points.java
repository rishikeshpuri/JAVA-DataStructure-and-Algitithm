import java.util.Scanner;

public class Choose_points {
    public static int upperBond(long[] arr, int low, int high, long element){
        while (low<high){
            int mid = low +(high-low)/2;
            if (arr[mid] > element){
                high = mid;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
    public static long waysOfTriplet(int n, long d, long[] arr){
        long totalWays = 0;
        for (int i=0; i<n;i++){
            int greaterInd = upperBond(arr, 0, n, arr[i] + d);
            int possibleElements = greaterInd - (i+1);
            if (possibleElements >=2){
                totalWays += (possibleElements * (possibleElements-1))/2;
            }
        }
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[] arr = new long[n];
        for (int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        System.out.println(waysOfTriplet(n, d, arr));
    }
}
