package calculator;
// program for inheritance single 
public class Calc {
    
    public int sum(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        if(a>b){
            return a-b;
        }
        else
        return b-a;
    }
    public void show(){
        System.out.println("hey this method belongs to Calc class");
    }
    
}
