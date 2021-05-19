public class sum_Of_Product_Of_Digits {
    public static int sumOfProductOfDigits(int n1, int n2)
    {
        if(n1==0 || n2==0){
            return 0;
        }
        int prodLastDigit =(n1%10)*(n2%10);
        int total = prodLastDigit+sumOfProductOfDigits(n1/10, n2/10);
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sumOfProductOfDigits(35,6798));

//        Explanation:-
//                For test 2:-
//                (8*5) + (9*3) + (7*0) + (6*0) = 67
    }
}
