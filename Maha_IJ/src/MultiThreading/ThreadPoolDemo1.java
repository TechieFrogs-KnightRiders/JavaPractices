package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        ExecutorService Ex = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Runnable th = new ThreadPoolDemo(" " + i);
            Ex.execute(th);//execute() method everytime it will start the thread and execute it
        }
        Ex.shutdown();//shutdown the ExcutorService
        while (!Ex.isTerminated()) {
        }
        System.out.println("Finished all Threads");
    }
}
