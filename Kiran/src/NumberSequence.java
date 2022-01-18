 public class NumberSequence implements Runnable {
    public int numbers = 9;
    static int num = 1;
    int rem;
    static Object Obj = new Object();
    NumberSequence(int rem){
        this.rem=rem;
     }
    
    public void run(){
        while(num<numbers){
            synchronized(Obj){
                while(num % 3 != rem){
                    try {
                        Obj.wait();
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"  "+num);
                num++;
                Obj.notifyAll();
            }
        }

    }


}


         
    
   