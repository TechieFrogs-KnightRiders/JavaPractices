public class ThreadOne {
    public static void main(String[] args) {
        MyThread t = new MyThread();             //thread instantiation
        t.start();
        for(int i=0;i<10;i++)                       //executed by main thread
         {
             System.out.println("main thread");
         }
    }
    
}
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++)                    //executed by child thread
        {
            System.out.println("child thread");
        }
    

        
    }
    


}
