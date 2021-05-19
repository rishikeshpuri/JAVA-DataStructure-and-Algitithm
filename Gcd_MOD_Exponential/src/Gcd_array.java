import java.util.Scanner;

public class Gcd_array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=0; i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int x  = 100001;
//        int count=0;
//        int max_count=0;
//        for (int i=0; i<n;i++){
//            count=0;
//            for (int j=0; j<n;j++){
//                if (arr[j] % arr[i] == 0){
//                    count++;
//                }
//                if (count > max_count){
//                    max_count = count;
//                }
//            }
//        }
//        System.out.println(max_count);
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        int answer = 0;
        while( i<arr.length){
            int chck=arr[i];
            int temp = 0;
            for(int j=0;j<arr.length;j++){

                if(arr[j]%chck==0){
                    temp ++;
                }
            }
            i++;
            answer = Math.max(temp, answer);
        }

        // Arrays.sort(count);
        System.out.println(answer);
    }
}
