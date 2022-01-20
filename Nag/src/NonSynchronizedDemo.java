class Table{
     void printTable(int n){ // Synchornized the method
       synchronized(this){ // synchronized block
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
       }
        
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class NonSynchronizedDemo {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread1 m1 = new MyThread1(t);
        MyThread2 m2 = new MyThread2(t);
        m1.start();
        m2.start();
    }
}
