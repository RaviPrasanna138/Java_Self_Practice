package Sortings;

public class Arr {
    
    public static void main(String[] args) {
        int a[]={11,82,23,7};
        int pos=-1;
        for(int i=0;i<a.length;i++){
          if(a[i]==7)
              pos=i;
        }
System.out.println(pos);   
        for(int i=pos-1;i<a.length;i++){
              a[i]=a[i+1];     
        }
        int size=a.length-1;

      // for(int i=0;i<a.length-1;i++)
      // System.out.print(a[i]+" "); 
    }
    
}
