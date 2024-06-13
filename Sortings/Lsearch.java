package Sortings;

public class Lsearch {
    public static void main(String[] args) {
        int a[]={2,4,7,9,2};
        int search=2;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
            System.out.println(search+" element found at index "+i);
            break;
            }

        }
    }
}
