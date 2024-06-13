// program for static block  and static  method 
class Phone{
    static String name;
    int price;
    int cam;
    static{
        name="Android";
        System.out.println("this is Static block ra baccha");
    }

    Phone(){
        System.out.println("This is Contructor");
        price=5000;
        cam=50;
    }
    public static void show(Phone obj){
        System.out.println("This is static method and i dont need obj to call me ");
        System.out.println(name+" "+obj.price+" "+obj.cam);
    }
}

public class PhoneObj {
 
    public static void main(String[] args)  {
      Phone obj=new Phone();
      obj.cam=64;
      obj.price=100000;
      Phone.name="Iphone";

     Phone.show(obj);

}
}
