
import java.util.Scanner;
public class fizzBuzz {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            if ((i % 3) == 0 && (i % 5)==0){
//                System.out.print("FizzBuzz ");
//            }
//            else if ((i % 3) == 0){
//                System.out.print("Fizz ");
//            }
//            else if ((i % 5)==0){
//                System.out.print("Buzz ");
//            }
//            else {
//                System.out.print(i + " ");
//            }
//        }






        int Size, i, OddSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();

        int [] a = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum=0;
        int mean =0;
        for(i = 0; i < Size; i++)
        {
//            if(a[i] % 2 != 0)
//            {
//                OddSum = OddSum + a[i];
//            }
            sum = sum + a[i];
            mean = sum / Size;
        }
        System.out.println(sum + " " + mean);
    }
    }

