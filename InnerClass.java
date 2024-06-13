// a program for Inner class Concept

class A{

     int age;
     public void disp(){
        System.out.println("Outer Class");
     }
   class B{
        public void show(){
            System.out.println("Inner class Method");
        }
     }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.disp();
        
          A.B obj2=obj.new B();  // this is how we create obj for inner class
         obj2.show();
         

  
    }
}
