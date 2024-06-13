package calculator;
public class ScientCalc extends AdvCalc {
     public int powr(int a,int b){
        return (int)Math.pow(a, b);

     }
     public void show(){ // method overriding 
        System.out.println("hey this method belongs to Scientfic calculator class");
    }
    
}
