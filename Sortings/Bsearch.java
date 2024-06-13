package Sortings;

public class Bsearch {
    public static void main(String[] args) {
        int a[]={3,4,5,7,8,99};
        int low=0;
        int high=a.length-1;
        int mid=(low+high)/2;
        int target=4;
        System.out.print(find(target,low,mid,high,a));
    }

        public static int  find(int target,int low,int mid,int high,int a[])
        {
        while(low<=high)
        {
            if(a[mid]==target)
              return mid;
            else if(target<a[mid])
                high=mid-1;
            else
             low=mid+1;
        }
        return -1;
    }

 }
