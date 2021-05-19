public class checkEvenOdd {
    public static void main(String[] args) {
        int x = 152;
        if ((x & 1) == 1){
            System.out.println(x+" is odd");
        }
        else {
            System.out.println(x+" is even");
        }
    }
}
