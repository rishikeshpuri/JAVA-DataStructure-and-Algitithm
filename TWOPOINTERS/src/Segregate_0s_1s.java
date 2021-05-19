public class Segregate_0s_1s {
    public static void sort01(int[] arr, int n){
        int left = 0;
        int right = n-1;
        while (left<right){
            if (arr[left] == 1){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
            else {
                left++;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,0,0,1,1,0,0,1};
        sort01(arr, arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
