package Threads;
 // prgram to create threads with implemintimg Runnabale  interface 
// class AA implements Runnable{


// }
// class BB implements Runnable{

//     @Override
//     public void run() {
//         // TODO Auto-generated method stub
//         System.out.println("Hello");
       
// }
//}

class Counter{
    int cnt;
    public  synchronized void show(){
    cnt++;
    }
}
public class ThreadsWithImplements {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();

        Runnable obj= () ->
         {
                // TODO Auto-generated method stub
                for(int i=0;i<10000;i++){
                    c.show();
                }
            
        };
        Runnable obj2=()->
        {
            // TODO Auto-generated method stub
            for(int i=0;i<10000;i++){
                c.show();
            }
          
    };


        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();;
        t2.join();
         System.out.println(c.cnt);
    }
    
}
