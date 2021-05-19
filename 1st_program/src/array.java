public class array {
    public static void main(String[] args) {
//        int [] marks;
//        marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 70;
//        marks[2] = 90;
//        marks[3] = 87;
//        marks[4] = 100;
//        System.out.println(marks[0]);

//        int [] a = {1,2,3,4,5};
//        System.out.println(a[2]);
//        System.out.println("length :" + a.length);

//        for(int i=a.length -1; i>=0;i--){
//            System.out.print(a[i]+ " ");
//        }
//        System.out.println();
//        for (int ele: a){
//            System.out.println(ele);
//        }

        int [] [] flats;
        flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for (int i=0; i<flats.length;i++){
            for (int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
//        for (int ele : flats){
//            System.out.println(ele);
//        }


    }
}

