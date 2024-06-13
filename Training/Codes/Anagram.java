package Training.Codes;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        String A="Cat", B="Act";
        int flag=-1;
        if(A.length()!=B.length())
        flag=-1;
        else{
          char a[]=A.toLowerCase().toCharArray();
          char b[]=B.toLowerCase().toCharArray();
          Arrays.sort(a);
          Arrays.sort(b);
          if(Arrays.equals(a,b))
          flag =0;
          
        }
        if(flag==0)
        System.out.println("Anagarams");
        else
        System.out.println("Not Anagarams");

    }
    
}
