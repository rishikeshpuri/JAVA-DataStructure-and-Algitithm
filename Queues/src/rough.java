public class rough {
    public static void main(String[] args) {
        String a = "Rishi";
        System.out.println(a.hashCode());
        a = a.replace('R', 'j');
        System.out.println(a.hashCode());
    }
}
