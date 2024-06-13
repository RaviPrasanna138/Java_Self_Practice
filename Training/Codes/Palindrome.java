package Training.Codes;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char arr[]=new char[A.length()];
        arr=A.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(arr[i]==arr[j])
                flag=true;
                else
                flag=false;
            }
        }
        if(flag)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
