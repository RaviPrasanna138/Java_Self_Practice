
class TT{
    public void show() throws Exception{
      Class.forName("RRR");
    }
}

public class ThrowsEx {
    public static void main(String[] args) {
        TT obj=new TT();
        try {
            obj.show();
        } catch (Exception e) {
           
            System.out.println(e);
        }
        
    }
}
