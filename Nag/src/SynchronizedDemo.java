class Table1{
    synchronized static void printTable(int n){ // Synchornized the method
       //synchronized(this){ // synchronized block
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
      // }
        
    }
}

class MyThread5 extends Thread{
    
    public void run(){
        Table1.printTable(5);
    }
}

class MyThread6 extends Thread{
    
    public void run(){
        Table1.printTable(10);
    }
}

class MyThread3 extends Thread{
    
    public void run(){
        Table1.printTable(100);
    }
}

class MyThread4 extends Thread{
    
    public void run(){
        Table1.printTable(1000);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        //Table t = new Table();
       
        MyThread3 m3 = new MyThread3();
        MyThread4 m4 = new MyThread4();
        MyThread5 m5 = new MyThread5();
        MyThread6 m6 = new MyThread6();
      //  m1.start();
      //  m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
    }
}
