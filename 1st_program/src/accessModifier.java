import java.lang.Math;
class Circle{
    private int radius;

    public void setradius(int r){
        radius = r;
    }

    public int getradius(){
        return radius;
    }

    public double getCircumference(){
        return 2* Math.PI*Math.pow(radius, 2);
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

}


public class accessModifier {

    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.setradius(2);
        System.out.println(cr.getradius());
        System.out.println(cr.getCircumference());
        System.out.println(cr.getArea());


    }
}
