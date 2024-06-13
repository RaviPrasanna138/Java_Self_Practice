// program for final keyword 
class Cal{
    final  public void show(){
        System.out.println("this is method of calc");
     }
     public void add(int a,int b){
      
        System.out.println(a+b);
     }
}
class Bcal extends Cal{
    // public void show(){

    // }

}
public class Finall {
public static void main(String[] args) {
   // final int ABC=20;
    Bcal obj=new Bcal();
    obj.add(20,220);
}

    
}
