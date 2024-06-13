// Encapsulation : biding of data into sigle unit ex:class
// this is a program for demonstarte the encapsulation and how to access the 
// private members of class i.e through the getter and setters
class Human{
 private int age;
 private String name;
 public int  getAge(){
    return age;
 }
 public String getName(){
    return name;
 }
 public void setName(String x){
    name=x;
 }
 public void setAge(int a){
    age=a;
 }
}
public class Humanob {
    public static void main(String[] args) {
     Human obj=new Human();
     obj.setAge(23);
     obj.setName("Ravi");
     System.out.println(obj.getAge()+" ,"+obj.getName());
     
    }
}
