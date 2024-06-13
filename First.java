class Oops{
    public void fun()
    {
        System.out.print("hey its just a function ");
    }
    public int add(int a,int b){
        return a+b;
    }
    public String Music()
    {
        return "Music";
    }
    public float flat(){
        return 2.3f;
    }
}
class First{

    public static void main(String args[]){
        Oops obj=new Oops();
        obj.fun();
        int a=40,b=20;
       int res=obj.add(a,b);
       System.out.print(res);
       obj.Music();
       System.out.println(obj.flat());
    }
}
