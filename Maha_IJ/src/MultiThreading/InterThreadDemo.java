package MultiThreading;

 class BankAtm {
    int amount=100000;
    synchronized void Withdraw(int amount) {
        System.out.println("doing withdraw");
        if (this.amount < amount) {
            System.out.println("Less balance ");
            try {
                wait();
            } catch (Exception e) {}
        }
        this.amount -= amount;
        System.out.println("Withdraw completed");
    }
    synchronized void Deposit(int amount){
        System.out.println("Adding amount");
        this.amount+=amount;
        System.out.println("Adding completed");
        notify();

    }
}
public class InterThreadDemo {
    public static void main(String[] args) {
        BankAtm bobj=new BankAtm();
         new Thread(){
             public void run(){
                 bobj.Withdraw(500);
             }
             }.start();
         new Thread(){
             public void run(){
                 bobj.Deposit(20000);
             }
         }.start();

    }
}
