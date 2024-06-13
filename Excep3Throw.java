public class Excep3Throw {
    public static void main(String[] args) {
        int num=1;
        int deno=0;
        int res;
        try{
            res=num/deno;
            throw ArithmeticException;
        }catch(Exception e){
            System.out.println(e);
        }   
    }
}
