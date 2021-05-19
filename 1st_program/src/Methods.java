public class Methods {

//     int CheckNo(int x,int y){
//        int z=0;
//        if (x>y){
//            z+=x;
//        }
//        else{
//            z+=x+y;
//        }
//        return z;
//    }
//
    static int Sum(int ...arr){
        int res = 0;
        for (int ele:arr){
            res= res+ele;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("The ans is :"+ Sum(2,3,4));
//        int a = 5;
//        int b = 2;
//        Methods obj = new Methods();
//        int sum=obj.CheckNo(a,b);
//        System.out.println(sum);
//
//        int a1 = 1;
//        int b1 = 2;
//        int sum1=obj.CheckNo(a1,b1);
//        System.out.println(sum1);

    }
}
