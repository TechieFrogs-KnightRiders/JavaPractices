public class Shutdown extends Thread {

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                //TODO: handle exception
            }
        }
        System.out.println("Shut");

    }
    

    
}
