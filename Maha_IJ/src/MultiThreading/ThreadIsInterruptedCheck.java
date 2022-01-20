package MultiThreading;

public class ThreadIsInterruptedCheck extends Thread {
    public void run(){
        for(int i=1;i<=2;i++){
            if(Thread.interrupted()){
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("code for interrupted Thread");
            }
            else{
                System.out.println("code for normal thread");
            }
        }//end for loop
    }

    public static void main(String[] args) {
        ThreadIsInterruptedCheck t1=new ThreadIsInterruptedCheck();
        ThreadIsInterruptedCheck t2=new ThreadIsInterruptedCheck();
        t1.start();
        t1.interrupt();
        t2.start();
    }
}
