public class position_of_rightmost_set_bit {
    public static void main(String[] args) {
        int y=4;
        int count = 1;
        while ((y & 1) !=1){
            y = y >> 1;
            count++;
        }
        System.out.println(count);
    }
}
