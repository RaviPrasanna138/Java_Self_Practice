// program for strings 
public class Springs {
    
    public static void main(String[] args) {
        String name="Ravi";
        System.out.println(name);
        System.out.println(name.compareToIgnoreCase("ravi"));

        StringBuffer nam=new StringBuffer("yahweh");
        System.out.println(nam.replace(0, 3, "yesu"));
    }
}
