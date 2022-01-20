package MultiThreading;

public class ThreadGroupDemo implements Runnable {
    public void run(){
        System.out.println("MY Thread Group");
        try{
            Thread.currentThread().sleep(3000);
        }catch(InterruptedException e){ e.printStackTrace();}
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
    }
    public static void main(String[] args) {
        ThreadGroup TG=new ThreadGroup("Maha");
        Thread t1= new Thread(TG, new ThreadGroupDemo(), "my Name");//Anonymous way to crating obj (new ThreadGroupDemo())
        Thread t2= new Thread(TG, new ThreadGroupDemo(), "my Name");
        Thread t3= new Thread(TG, new ThreadGroupDemo(), "my Name");
        Thread t4= new Thread(TG, new ThreadGroupDemo(), "my Name");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("My List of Threads");
        System.out.println(t1.isDaemon());
        TG.list();
       // TG.destroy();
        System.out.println("is Destroyed thread  " +TG.isDestroyed());
        //TG.suspend();
        //TG.resume();
        TG.interrupt();




        System.out.println("Active Thread count is " +TG.activeCount()+" "+TG.getName()+" "+TG.getParent());

    }
}
