import java.util.Scanner;
public class countInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i=1; i<=100; i++){
            if ((i % n) == 0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
