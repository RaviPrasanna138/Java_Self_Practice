package Training.Codes;

public class StringCount {
    public static void main(String[] args) {
        String a="java J2EE Java JSP J2EE";
        char arr[]=new char[a.length()];
        int arr2[]=new int[a.length()];
        a=a.replaceAll(" ", "");
        arr=a.toCharArray();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            cnt=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    arr2[i]=cnt;      
            }
        }
    }       
        for(int i=0;i<a.length();i++){
            if (arr2[i]!= 0)
            System.out.print(a.charAt(i)+"="+arr2[i]+" ");
        }
    }
}
