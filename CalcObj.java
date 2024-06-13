

import calculator.ScientCalc;

public class CalcObj {
    public static void main(String[] args) {
        ScientCalc obj=new ScientCalc();
       System.out.println( obj.sum(10, 20));
       System.out.println( obj.sub(10, 20));
       System.out.println( obj.mul(10, 20));
       System.out.println( obj.div(10, 20));
       System.out.println( obj.powr(2, 2));
       obj.show();

    }
}
