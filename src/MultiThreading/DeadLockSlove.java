package MultiThreading;


    public class DeadLockSlove {
        public static void main(String[] args) {
            DeadLockSlove dobj = new DeadLockSlove();
            Inner1 rs1 = dobj.new Inner1();
            Inner2 rs2 = dobj.new Inner2();
            Runnable r1 = new Runnable() {
                public void run() {
                    synchronized (rs2) {
                       // System.out.println("This is thread1 Runnable1");
                        try {
                            Thread.sleep(100);//Adding sleep so that both Threads start trying to lock resources
                        } catch (InterruptedException ie) {
                            ie.printStackTrace();
                        }
                    }
                    synchronized (rs1) {
                        System.out.println("In block1");
                    }
                }
            };
            Runnable r2 = new Runnable() {
                public void run() {
                    synchronized (rs2) {
                        synchronized (rs1) {//Thread 2 have resource 2 but need resource1 also
                            System.out.println("In block2");
                        }
                    }
                }
            };
            new Thread(r1).start();
            new Thread(r2).start();
        }
            class Inner1 {
                private int i = 10;

                public int get() {
                    return i;
                }

                public void set(int i) {
                    this.i = i;
                }
            }

                class Inner2 {
                    private int j = 20;

                    public int get() {
                        return j;
                    }

                    public void set(int j) {
                        this.j = j;
                    }

                }
    }
