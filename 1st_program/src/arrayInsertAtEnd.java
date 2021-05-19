import java.util.Scanner;

public class arrayInsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        for (int i=0; i<t;i++){
            arr[i] = sc.nextInt();
        }
//        for (int ele: arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
        int x = arr[0];
//        System.out.println(x);

        int[] Mainarr = new int[x];

        for (int i=0;i<x; i++){
            Mainarr[i] = i+1;
        }

        int[] origArr= new int[x+1];
        for (int i=0;i<x;i++){
            origArr[i] = Mainarr[i];
        }
        origArr[x]=arr[1];


//        for (int mainele: Mainarr){
//            System.out.print(mainele + " ");
//        }
//        System.out.println();
        for (int ori: origArr){
            System.out.print(ori + " ");
        }



    }
}
