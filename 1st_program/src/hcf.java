public class hcf {
    public static void main(String[] args) {
//        int hcf=0;
//        int N = 8;
//        int P = 16;
//        for(int i=2;i <= N && i <= P;i++){
//            if(N%i==0 && P%i==0){
//                hcf = i;
//            }
//        }
//        System.out.println(hcf);;

        int N = 8;
        int P = 16;
        int hcf=0, q=0, r=0 ;
        if(N%P == 0) {
            hcf = P;
        } else {
            q = N/P;
            r = N%P;
        }
        int i;
        for(i = r; i != 0;) {
            N = P;
            P = i;
            hcf = P;
            q = N/P;
            i = N%P;

        }
        System.out.println(hcf);
    }
}
