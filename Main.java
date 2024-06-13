// Method Overloading Conccept
 class Poly {
    public void add(){
        System.out.println("This Function performs Additon");
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}
class Main{
    public static void main(String[] args) {
        Poly obj=new Poly();
        obj.add();
       System.out.println( obj.add(20, 30));
       System.out.println( obj.add(20, 20,30));
       System.out.println( obj.add(7,3));
    }
}