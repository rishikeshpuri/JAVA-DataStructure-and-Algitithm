import java.util.Scanner;

public class building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr;
        arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count=1;
        int curr_max=arr[0];
        for (int i=1;i<n;i++){
            if (arr[i] > curr_max){
                count=count+1;
                curr_max=arr[i];
            }
        }
        System.out.println(count);

    }
}
