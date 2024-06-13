
// funcational interface with lambada expression 
@FunctionalInterface
interface A{
    int show(int i ,int j);
}

public class FuncationalInterface {
    public static void main(String[] args) {
        
    A  obj=(i,j)-> i+j;
     System.out.println(obj.show(20,2));

 }   
}
