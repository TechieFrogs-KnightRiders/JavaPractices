import java.util.Scanner;

public class ThreadClassDemo extends Thread {
   public void run(){
    Scanner sc= new Scanner(System.in);
    String name = sc.next();
    System.out.println(this.getState());
    System.out.println("This is my thread "+name);
    
   }

   public static void main(String[] args) {
       
       
       ThreadClassDemo threadObj = new ThreadClassDemo();
       System.out.println(threadObj.getState());
       threadObj.start();
      // threadObj.j
      // System.out.println(threadObj.getState());
      // System.out.println(threadObj.getState());
       ThreadClassDemo threadObj1 = new ThreadClassDemo();
     //  System.out.println(threadObj.getName()+"    "+threadObj1.getName());
      // System.out.println(threadObj.getId()+"    "+threadObj1.getId());
      threadObj1.start();
     // System.out.println(threadObj1.getState());
      // threadObj1.start();

   }
}
