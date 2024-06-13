// program for static keyword 
// static varibles or methods are class level 
// and static varibale are common for every object 
//static variables  are reffred or called by direct class name 

// static block --> syntax is static{} 
public class Mobile {
    static int storage;
     String name;
    int price;
    String os;
    public void show(){
        System.out.println(name+" "+price+" "+os+" "+storage);
    }

    public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.os="Android";
        obj.price=25000;
        obj.name="Realme 7";

        Mobile obj2=new Mobile();
        obj2.os="ios";
        obj2.price=105000;
        obj2.name="iphone 7";

        Mobile.storage=256;
        obj.show();
        obj2.show();
    }
}
