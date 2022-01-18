
    public class ThreadGroup1 implements PrintEvenThread{
        public void run(){
            System.out.println("My running Thread");
        }
        public static void main(String[] args) {
            ThreadGroup tg1=new ThreadGroup("TG1");
            Thread t1 = new Thread(tg1,new ThreadGroup1(),"My t1");
            Thread t3 = new Thread(tg1,new ThreadGroup1(),"My t3");
            Thread t2 = new Thread(tg1,new ThreadGroup1(),"My t2");
            Thread t4 = new Thread(tg1,new ThreadGroup1(),"My t4");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            tg1.list();
            System.out.println(tg1.activeCount()+" "+tg1.getName()+" "+tg1.getParent());
        }
        
        
    }

    

