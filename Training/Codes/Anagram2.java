package Training.Codes;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram2{
  public static boolean isAnagaram(String A,String B){
    boolean flag=false;
    if(A.length()!=B.length())
        flag=false;
        else{
          char a[]=A.toLowerCase().toCharArray();
          char b[]=B.toLowerCase().toCharArray();
          Arrays.sort(a);
          Arrays.sort(b);
          if(Arrays.equals(a,b))
          flag =true;
          
        }
    return flag;
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

        String A=sc.nextLine(), B=sc.nextLine();
        boolean res=isAnagaram(A, B);
  
        if(res)
        System.out.println("Anagarams");
        else
        System.out.println("Not Anagarams");

    }
    
}