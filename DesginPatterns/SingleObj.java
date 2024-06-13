package DesginPatterns;
// Singleton class

class Singleton{

    static Singleton obj=new Singleton();
    private Singleton(){
        
    }
    static Singleton getInstace(){
        return obj;
    }

}
class SingleObj{
    public static void main(String[] args) {
        Singleton object=Singleton.getInstace();
        System.out.println(object.hashCode());
        Singleton object2=Singleton.getInstace();
        System.out.println(object2.hashCode());
        System.out.println( object.equals(object2));
        
    }
}