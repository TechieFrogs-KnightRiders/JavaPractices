public class ThreadUsingRunnable implements Runnable {
    public void run(){
        System.out.println("In my thread");
    }

    public static void main(String[] args) {
        ThreadUsingRunnable tObj = new ThreadUsingRunnable();

        Thread t1 = new Thread(tObj); //Runnable

        Thread t2 = new Thread(tObj); 

        Thread t3 = new Thread("My New Thread"); // String or thread name
         t3.start();
         System.out.println(t3.getName());

         Thread t4  = new Thread(tObj, "My Thread");

         t4.start();

         System.out.println(t4.getId()+"   "+t4.getName());

        t1.start();
        t2.start();

        System.out.println(t1.getId()+"  "+t2.getId()+"  "+t3.getId());
    }
}
