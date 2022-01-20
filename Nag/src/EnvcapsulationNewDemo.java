public class EnvcapsulationNewDemo {
    public static void main(String[] args) {
        EncapsulationDemo encObj = new EncapsulationDemo();
        encObj.k = 50;
        
       // this.l
        encObj.setFirstName("Nag");
        encObj.setI(100);  // write access or setting the
        int myI = encObj.getI(); // read access
        System.out.println(myI+"  "+encObj.getFirstName());

    
    }
}
