// program for handling multiple excpetions through multiple catch block
public class ExcepEx2 {
    public static void main(String[] args) {

        int num=1;
        int deno=1;
        int res;
        int a[]=new int[5];
        String str=null;
        try{
          res=num/deno;
          System.out.println(a[2]);
          System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("check your denomenator value once");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("U cant access the array elements which are out of range");
        }
        catch(Exception e){                                      //Exception is a parent class which can handle any time of exception and handle it 
            System.out.println(" ooops something went wrog "+ e);        
        }
        
    }
}
