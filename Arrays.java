/**
 * Arrays concept 
 */
public class Arrays {

    public static void main(String[] args) {
        int a[]={1,2,3};  // initlizing and delaring an array 
        for(int i=0;i<3;i++)
        System.err.println(a[i]);
        int b[]=new int[5];  // creating an array 
        System.out.println(b[0]);
    

    int arr[][]=new int[5][4];
    for(int i=0;i<5;i++){
        for(int j=0;j<4;j++){
          arr[i][j]= (int)(Math.random()*10);
        }
      
    }

    for(int i=0;i<5;i++){
        for(int j=0;j<4;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
    for(int i[]:arr){
        for(int j:i){
            System.out.println(j +" ");
            System.out.println();
        }
       

    }
}
}