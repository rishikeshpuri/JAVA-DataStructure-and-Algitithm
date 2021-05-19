import java.util.Scanner;
public class number_of_ways_an_integer_N_can_be_represented_as_a_sum_of_unique_natural_numbers {
    public static int ways(int sum, int start, int currSum){
        if(currSum == sum){ //possible combination
            return 1;
        }
        else if(currSum > sum){ //impossible combination
            return 0;
        }

        int res = 0;

        for(int i = start; i <= sum-currSum; i++){
            res += ways(sum, i+1, currSum+i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        while(test-- >0){
            int N = scn.nextInt();
            int res = ways(N, 0, 0);
            System.out.println(res/2);
        }
    }
}
//    Sample input
//        4
//        6
//        1
//        4
//        2
//
//        Sample output:-
//        4
//        1
//        2
//        1
//
//        Explanation:-
//        TestCase1:-
//        6 can be represented as (1, 2, 3), (1, 5), (2, 4), (6)

