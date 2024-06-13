// Wrapper classes -- why java is not 100 Percnetage obj lang coz of primitavies 
public class WrapperClasses {
    public static void main(String[] args) {
        int a=20;
        Integer num=a; // auto boxing 
        System.out.println(num);

        Integer num2=num; // auto unboxing
        System.out.println(num2);

       String str="602122";
       int b=Integer.parseInt(str); // parseInt method:
       System.out.println(b);


    }
}
