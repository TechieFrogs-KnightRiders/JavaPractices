package MultiThreading;

public class MultiThreadDemo extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " My Thread "+Thread.currentThread().getPriority());
      //  System.out.println("My Thread");
    }
    public static void main(String[] args) {
        MultiThreadDemo mobj=new MultiThreadDemo();
        MultiThreadDemo t1=new MultiThreadDemo();
        MultiThreadDemo t2=new MultiThreadDemo();
        MultiThreadDemo t3=new MultiThreadDemo();
        MultiThreadDemo t4=new MultiThreadDemo();
        MultiThreadDemo t5=new MultiThreadDemo();
        mobj.setName("aaa");
        t1.setName("bbb");
        t2.setName("ccc");
        t3.setName("ddd");
        t4.setName("eee");
        t5.setName("fff");
       // Thread t1=new Thread();
        //Thread t2=new Thread("Mastan");
        //Thread t3=new Thread();
        //Thread t4=new Thread(mobj);
        //Thread t5=new Thread();
       // System.out.println(t2.getId()+"  "+ t2.getName());
        //t2.start();//if we call thread multiple times even it will execute only once

        //System.out.println(mobj.getId()+"  "+mobj.getName());
       // System.out.println(t1.getId()+"  "+t1.getName()+" "+t1.getPriority()+ " "+t2.getPriority());
       // t2.start();
       // t1.start();
        t1.setPriority(3);//if previously we start thread and getpriority() it will take default
        t2.setPriority(2);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(4);
        t5.setPriority(Thread.MAX_PRIORITY);
        mobj.setPriority(Thread.MIN_PRIORITY);
        mobj.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        //System.out.println(t1.getPriority()+ " "+t2.getPriority()+" "+t3.getPriority()+" "+t4.getPriority());

       // t4.start();
       // System.out.println(t1.getId()+"  "+t1.getName()+" "+t1.getPriority()+ " "+t2.getPriority());

    }
}
