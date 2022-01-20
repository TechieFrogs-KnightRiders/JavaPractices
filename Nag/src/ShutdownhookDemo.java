public class ShutdownhookDemo extends Thread {

    public void run(){
        System.out.println("In my thread work");
    }
    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        ShutdownhookDemo s1 = new ShutdownhookDemo();
        r1.addShutdownHook(s1);
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        //System.exit(0);
       // s1.start();
    }
}
