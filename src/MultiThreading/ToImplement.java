package MultiThreading;

public class ToImplement implements Runnable{
    @Override//we can not use yield,
    public void run() {
        System.out.println("My Thread");

    }
    public static void main(String[] args) {
        ToImplement tobj=new ToImplement();
        ToImplement tobj1=new ToImplement();
        Thread t1=new Thread(tobj1);//it will upcast to Runnable we cannot give Runnable obj so child class(current class obj)
                                      // reference we r proving
        Thread t2=new Thread();
        Thread t3=new Thread("MMM");


        t1.start();
        tobj.run();
       // tobj1.start();
        t2.start();

    }
}
