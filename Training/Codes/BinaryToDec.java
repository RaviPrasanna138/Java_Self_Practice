// program to convert binary num to decimal numb without using inbuilt fucntion
package Training.Codes;
public class BinaryToDec {
    public static void main(String[] args) {
        String s="111000";
        int a=Integer.parseInt(s);
      int rem,dec=0;
      int arr[]=new int[s.length()];
       int  i=s.length()-1;
        while(a!=0){
            rem=a%10;
           arr[i--]=rem;
            a/=10;
            
        }
       // System.out.println(Arrays.toString(arr));
        for(int j=0;j< arr.length;j++){
              dec=dec*2+arr[j];
        }
        System.out.println(dec);
    }
}
