package Training.Codes;

class RavisException extends Exception{
    public RavisException(String s){
   super(s);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        int i=19;
        int j=19;
        try{
           int res= j/i;
           if(res==1)
           throw new RavisException("this cant be done");

        }catch(RavisException e){
            System.out.println(e);
        }
    }
}




