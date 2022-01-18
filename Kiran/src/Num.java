public class Num {
    public static void main(String[] args) {
        NumberSequence t1 = new NumberSequence(1);
        NumberSequence t2 = new NumberSequence(2);
        NumberSequence t3 = new NumberSequence(0);
        
        Thread r1 = new Thread(t1,"T1");
        Thread r2 = new Thread(t2,"T2");
        Thread r3 = new Thread(t3,"T3");
        
        r1.start();
        r2.start();
        r3.start();

        
    }
}
