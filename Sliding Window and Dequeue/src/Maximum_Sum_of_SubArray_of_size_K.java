public class Maximum_Sum_of_SubArray_of_size_K {
    public static int maxSumSubArray(int[] arr, int n, int k){
        int i=0;
        int j=0;
        int sum=0;
        int MAX = Integer.MIN_VALUE;
        int max=0;
        if (n < k){
            System.out.println("Invalid");
            return -1;
        }
        while (j < n){
            sum = sum+arr[j];
            if ((j-i+1) < k){
                j++;
            }
            else if ((j-i+1) == k){
                max = Integer.max(MAX,sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSumSubArray(arr, arr.length, k));
    }
}
