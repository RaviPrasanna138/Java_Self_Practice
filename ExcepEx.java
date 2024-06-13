// program for exception handling  
// a simple program for handling exceptions 
public class ExcepEx {
    public static void main(String[] args) {
        int i=0;
        int j=4;
        int res;
        try{
          res=j/i;
        }
        catch(Exception e){
            System.out.println("oops somenthing went wrong: "+e);
        }
        
        System.out.println("Program Excuted sucessfully");
    }
    
}
