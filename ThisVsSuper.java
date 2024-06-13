class A{
 A(){
    System.out.println("A Const");
 }
 A(int a){
    this();
   System.out.println(a+" parametrixed  parent ");
 }
}

class B extends A{
     B(){
        System.out.println("B constructor");
     }
     B(int a){
        //this();
        super(a);
        
       System.out.println(a+" parametrixed ");
     }
}
public class ThisVsSuper {
    public static void main(String[] args) {
    
  B obj=new B(10);
    }
     
}
