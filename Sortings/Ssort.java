package Sortings;

public class Ssort {
    public static void main(String[] args) {
        int arr[]={3,7,9,1,0};
        int min=arr[0];
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=j;
                
                }
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
                
            }
        }
        for(int i :arr)
        System.out.print(i+" ");


    }
    
}
