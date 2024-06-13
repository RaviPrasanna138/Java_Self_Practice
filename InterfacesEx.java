// Program for Interfaces  

interface A{
 void show();
 void config();
}
class B implements A{

    
    public void show() {
    System.out.println("show method");
    }

    public void config() {
      System.out.println("Config method");
    }
    
}
public class InterfacesEx {
    public static void main(String[] args) {
        
    B obj=new B();
    obj.show();
    obj.config();
}
}
