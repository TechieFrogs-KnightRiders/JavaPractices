public class ThreadClassDemo implements Runnable {
    public void run(){
        System.out.println("RRR");
        
       
    }
    
  
    public static void main(String[] args) {
        ThreadClassDemo t3Obj = new ThreadClassDemo();

        Thread t4 = new Thread(t3Obj);
        t4.start();

        
        
        Thread t=new Thread("R");
        Thread t1=new Thread("RR");
       
       System.out.println(t.getName()+" "+t1.getName());
       
       
       
    }
}
