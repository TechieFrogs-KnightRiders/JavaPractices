package MultiThreading;
class Table{
      synchronized void printTable(int n){  //synchronized method
        for(int i=0;i<=5;i++){
            System.out.println(n*i);
            try {
               Thread.sleep(3000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
class MyThread1 extends Thread{
    Table t;//intstance of Table class
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Table t=new Table();
        MyThread1 t1=new MyThread1(t);
        MyThread2 t2=new MyThread2(t);
        t1.start();
        t2.start();

    }
}
