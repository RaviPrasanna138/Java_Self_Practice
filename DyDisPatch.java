// program for Dyanamic method Dispatach #polymorphism

class A{

    public void show(){
        System.out.println(" This A class method");
    }
}
class B extends A{

    public void show(){
        System.out.println(" This B class method");
    }
}

public class DyDisPatch {
public static void main(String[] args) {
   A obj= new B(); // even its is of object type A i.e Parent class it is refrening to the object of B means its pointing to the values or methods which B got.
   obj.show();
}    
}
