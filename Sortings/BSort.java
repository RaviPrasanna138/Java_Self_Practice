package Sortings;

// bubble sort prgram
public class BSort {

    public static int[] Sorting(int a[]){
    
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
        
    public static void main(String[] args) {
        int a[]={12,2,5,7,0};
       // int temp;
      
          int b[]=new int[a.length];
          b=Sorting(a);
            for(int i:b)
            System.out.print(i+" ");
            
    }        
    }