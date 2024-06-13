package Training.Codes;
import java.util.Arrays;
public class Pak {
    
    public static void main(String[] args) {
        int a[]={4,5,1},b[]={3,4,5};
        int value=0,value2=0;
        for(int i=0;i<a.length;i++){
            value=value*10+a[i];       // logic 1 to convert an array into integer 
        }
        for(int i=0;i<b.length;i++){
            value2=value2*10+b[i];       // logic 1 to convert an array into integer 
        }
        

        // String s=Arrays.toString(a); // inbuilt  method to convert array to integer 
        // s=s.replaceAll("\\[|\\]|,|\\s", "");
        // int val=Integer.parseInt(s);

        int sum=value+value2;
        System.out.println(value);
        System.out.println(value2);
        System.out.println(sum);
        

     // now conversion of integer to arrayy 
     // finding the length of the array from integer 

                 int count=0;
                int  n=sum;
                 while(n!=0){
                    count++;
                    n/=10;

                 }
                // System.out.println(count);  // we got the length of the array 
                 int index=count-1;
                 int arr[]=new int[count];
                 while(sum>0){
                    int i=sum%10;
                    arr[index--]=i;
                    sum/=10;
                 }
                  
                 
                 for(int i:arr)
                 System.out.print(i+",");

                 String s=Arrays.toString(arr);
                 s=s.replace("[","{");
                 s=s.replace("]","}");
                 System.out.println(s);   
    }
}
