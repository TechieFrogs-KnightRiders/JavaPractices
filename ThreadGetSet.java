public class ThreadGetSet {
    class MyThread extends Thread{

    }
    class Test{
        public static void main(String[] args) {
            System.out.println(Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(7);
            ThreadGetSet t = new ThreadGetSet();
            System.out.println(t.getPriority());
        }
    }
    
}
