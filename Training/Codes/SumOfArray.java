package Training.Codes;
// intermediate program 
public class SumOfArray {
    public static void main(String[] args) {
        
        int a[]={1,0,8,7,2};
        int sum=0;
        for(int i=0;i<a.length;i++)
         sum+=a[i];
        int rem;
        int fsum=0;

        if(sum>9){
        while(sum>0){
            rem=sum%10;
            fsum+=rem;
            sum/=10; 
       
        }
        System.out.println(fsum);
    }
    else
    System.out.println(fsum);
        

    }
}
