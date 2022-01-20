    public class EncapsulationDemo {

        private int i = 15;
        private String firstName = "Knight Riders";
        int k = 30;
        public int j = 30;
        protected int l = 50;
        private static int m = 300;

        public int getM(){
            return m;
        }
    
        public int getI(){  // Accessor method or Getter. Read access
           // m  =500;
            return i;
        }

        static void hello(){
            //l = 20;
            m = 250;
        }

        public String getFirstName(){
            return firstName;
        }

        public void setI(int a){  // Mutators or Modifiers or Setters
            i = a;
            //System.out.println(this.i+"   "+i);
        }

        public static void main(String[] args) {
            EncapsulationDemo encObj = new EncapsulationDemo();
            System.out.println(encObj.i);
        }

        void display(){
            int j = 20;
        }

        public EncapsulationDemo() {
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

       

    public int getK() {
        return this.k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getJ() {
        return this.j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getL() {
        return this.l;
    }

    public void setL(int l) {
        this.l = l;
    }
        
    }


