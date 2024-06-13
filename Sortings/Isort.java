package Sortings;

public class Isort {
    public static void main(String[] args) {
        int a[]={1,2,0,4,-2};
        int j,key;
        for(int i=1;i<a.length;i++){
               key=a[i];
               j=i-1;
            while( j>=0 && a[j]>key ){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i:a)
        System.out.print(i+",");

    }
    
}
