// program for abstract class and methods
abstract class Car{
    abstract public void drive();

    public void music(){
        System.out.println("a basic music system");
    }
}
class Mini extends Car{
    public void drive(){
        System.out.println("yeah Mini knows driving ");
    }
}
public class AbstractClassEx {
    public static void main(String[] args) {
         
   Mini min=new Mini();
   min.drive();}
}

