
import java.util.Scanner;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int a=2;
        int arr[]={1,2,3,4,5};
        int a[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
       
       int key=sc.nextInt();
       for(int i=0;i<arr.length;i++)
       {
        if(key==arr[i]){
        System.out.println("element found at index"+i);
        }
       }

    }
}
