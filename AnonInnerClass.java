// Program for Anonymus Inner class 
class OuterClass{
   public void exhibit(){
    System.out.println("Its outer class method");
   }
   public void show(){
    System.out.println("Another method of Outerclass");
   }
}
public class AnonInnerClass {
    public static void main(String[] args) {
        OuterClass ob= new OuterClass(){
            
            public void exhibit() {
            System.out.println("hey It got changed by Anonymus class man");
            }
            public void show(){
                System.out.println("show of inner");
               }
        };
        ob.exhibit();
        ob.show();
    }
}
