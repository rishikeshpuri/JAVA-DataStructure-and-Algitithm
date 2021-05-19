import java.util.Scanner;

public class Special_M_visor {

    public static String visor(int n, int m){
        int count=0;
        if (n==1 && m==1){
            return "Yes";
        }
        for (int i=2; i<=n; i+=2){
            if (n%i == 0){
                count+=1;
                System.out.println(i);
            }
            System.out.println("---  "+i);
        }
        if (count == m){
            return "Yes";
        }
        else return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(visor(n,m));

    }
}
