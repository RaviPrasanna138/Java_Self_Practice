package Threads;

/**
 * program for simple threads
 * 
 */

 class T1 extends Thread{
    public void show(){
        for(int i=0;i<100;i++)
        System.out.println("Hi");
        try {
            Thread.sleep(MAX_PRIORITY);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    

 }
 class T2 extends Thread{
    public void show(){
        for(int i=0;i<100;i++)
        System.out.println("hello");
        try {
            Thread.sleep(MAX_PRIORITY);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

 }
public class ThreadsEx {
public static void main(String[] args) {
    T1 obj=new T1();
    try {
        Thread.sleep(9);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    T2 obj1=new T2();
    System.out.println(obj.getPriority());
    obj.show();
   
    obj1.show();

}    
}