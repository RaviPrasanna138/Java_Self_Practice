package Training.Codes;

import java.util.Scanner;

public class Hi5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.replaceAll("\\s",""));
        String str=s.replaceAll("\\d|\\s", "");
        System.out.println("String from the input u entered :"+str);
        String num=s.replaceAll("\\D|\\s","");
        System.out.println("integer from the string u entered :"+num);
        
    }
    
}
