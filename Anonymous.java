// Anonymous Object Program
// the only problem with Anon objet is u cant use them 
class B{
B(){
    System.out.println("Object Created");
}
public void show(){
    System.out.println("Method in the B Class");
}
}

public class Anonymous {
   public static void main(String[] args) {
    new B().show();
    
   } 
}
