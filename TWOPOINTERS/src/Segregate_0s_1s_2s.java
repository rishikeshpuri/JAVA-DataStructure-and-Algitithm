public class Segregate_0s_1s_2s {
    public static void sort01(int[] arr, int n){
        int left = 0;
        int mid = 0;
        int right = n-1;
        while (mid <= right){
            if (arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
            else if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            }
            else {
                mid++;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,2,1,1,2,1};
        sort01(arr, arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
