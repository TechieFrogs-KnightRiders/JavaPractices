package MultiThreading;
class MsgSend{
    public void SendingMsg(String msg){
        System.out.println("Sending msg "+msg);
        try{
            Thread.sleep(400);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("\n" +msg+ "msg is sent ");
    }
}
class SendMsg1 extends Thread{
    private String msg;
    MsgSend ms;
    SendMsg1(String s,MsgSend ref){
        msg=s;
        ms=ref;
    }
    public void run(){
        synchronized (ms) {
            ms.SendingMsg(msg);
        }
    }
}

public class SynchronizedBlockAnony {
    public static void main(String[] args) {
        MsgSend msobj=new MsgSend();
        SendMsg1 t1=new SendMsg1("aaaa",msobj);
        SendMsg1 t2=new SendMsg1("java website",msobj);
        //send two threads of SendMsg1
        t1.start();
        t2.start();
        //wait for threads to end
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
