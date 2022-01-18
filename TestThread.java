public class TestThread extends Thread{
    public void run(){
        System.out.println("System is Shutting down");
    }
}
public class ShutdownHook extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("My main thread:"+i);
            if(i==3){
                System.exit(0);
            }
        }
        System.out.println("shutdownhook");
    }
    public static void main(String[] args) {
        TestThread t=new TestThread();
        TestThread t2=new TestThread();
        ShutdownHook sh=new ShutdownHook();
        ShutdownHook sh2 =new ShutdownHook();
        
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(t);
        r.addShutdownHook(t2);
        sh2.start();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
    
class TestThread extends Thread{
    public void run(){
       System.out.println("System is Shutting Down");


    }

}
public class ShutdownHook extends Thread{
    public void run(){
        for(int i=0;i<=0;i++)
        {
            System.out.println("My main thread:"+i);
            if(i==3){
                System.exit(0);
            }

    
        }
        System.out.println("shutdownHook");

    }
    public static void main(String[] args) {
        TestThread t=new TestThread();
        TestThread t2 = new TestThread();
        //ShutdownHook sh= new ShutdownHook();
        ShutdownHook sh2 = new ShutdownHook();

        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(t);
        r.addShutdownHook(t2);
        sh2.start();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
       // System.exit(0);
    }
}
