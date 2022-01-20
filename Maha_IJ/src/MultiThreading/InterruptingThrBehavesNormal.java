package MultiThreading;

public class InterruptingThrBehavesNormal extends Thread{
    public void run()
    {
        for(int i=0;i<=5;i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        InterruptingThrBehavesNormal obj=new InterruptingThrBehavesNormal();
        obj.start();
        obj.interrupt();
        System.out.println(obj.isInterrupted());
    }
}

