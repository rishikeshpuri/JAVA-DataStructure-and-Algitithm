import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Median_in_a_stream {
    static PriorityQueue<Integer> maxHeapLeft = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeapRight = new PriorityQueue<>();
    static double median = 0.0;
    public static double getMedian(int X){

        if (maxHeapLeft.size() == 0){
            median = X;
            maxHeapLeft.add(X);
            return median;
        }

        else if (maxHeapLeft.size() > minHeapRight.size()){
            if (X < median){
                minHeapRight.add(maxHeapLeft.remove());
                maxHeapLeft.add(X);
            }
            else {
                minHeapRight.add(X);
            }
            median = (double) (maxHeapLeft.peek() + minHeapRight.peek())/2;
        }
        else if (maxHeapLeft.size() == minHeapRight.size()){
            if (X < median){
                maxHeapLeft.add(X);
                median = (double) maxHeapLeft.peek();
            }
            else {
                minHeapRight.add(X);
                median = (double) minHeapRight.peek();
            }
        }
        else {
            if (X < median){
                maxHeapLeft.add(X);
            }
            else {
                maxHeapLeft.add(minHeapRight.remove());
                minHeapRight.add(X);
            }
            median = (double) (maxHeapLeft.peek() + minHeapRight.peek())/2;
//            return median;
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n -- > 0){
            int m = sc.nextInt();
            System.out.println(getMedian(m));
        }
    }
}
