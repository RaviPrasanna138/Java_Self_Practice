// program for enums 
// what is enum and uses of enum ?

enum Status{
    Janunary,Success,Failed,Pending;  // these are named constants 
}
public class EnumsExample {
    public static void main(String[] args) {
        Status[] s=Status.values();
        for(Status i :s){
        System.out.println(i.ordinal()+" :"+i);
        }
    }
}
