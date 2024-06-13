package Training.Codes;

public class ExcepThrow {
    public static void main(String[] args) {
        int i=19;
        int j=19;
        try{
           int res= j/i;
           if(res==1)
           throw new ArithmeticException("this cant be done");

        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
