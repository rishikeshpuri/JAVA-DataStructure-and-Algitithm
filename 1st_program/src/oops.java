
class Employe{
    int id;
    String name;
    int salary;
    public void personalDetail(){
        System.out.println("My id is :"+ id);
        System.out.println("My name is :"+ name);
    }
    public int getSalary(){
        return salary;
    }
}

  public class oops {
    public static void main(String[] args) {
        System.out.println("I am here!");
        Employe rishi = new Employe();
        Employe abhi = new Employe();

        rishi.id = 123;
        rishi.name = "Puri";
        rishi.salary = 15;
        abhi.id = 45;
        abhi.name = "Abhishekh";
        abhi.salary = 50;

        rishi.personalDetail();
        System.out.println(rishi.name +" "+ "salary is :" +rishi.getSalary());

        System.out.println();
        abhi.personalDetail();

        System.out.println(abhi.name +" "+ "salary is :" +abhi.getSalary());
    }
}
