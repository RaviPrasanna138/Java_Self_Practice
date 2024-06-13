// program for down casting and upcasting 
class A{ 

    public void show(){
        System.out.println("Parent method");
    }
}
class B extends A{
    public void show1(){
        System.out.println("child method");
    }
}

public class DownUpCasting {
    public static void main(String[] args) {

        A obj1=new B() ; // Upcasting   child-->Parent
        obj1.show();
        
        B obj=(B) obj1; // DownCasting   parent --> child
        obj.show1();
        
    }
}
