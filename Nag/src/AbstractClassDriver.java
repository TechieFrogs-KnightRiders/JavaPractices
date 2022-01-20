public class AbstractClassDriver extends AbstractClassDemo {

    void abstractMethod(){
        System.out.println("In abstract method");
    }

    void myAbstarctMethod(int k, String s){
        System.out.println("In my abstract method "+ k+"  "+s);
    }

    

    public static void main(String[] args) {
       AbstractClassDriver driverObj = new AbstractClassDriver();
       driverObj.abstractMethod();
       driverObj.display();
       driverObj.finalMethod();
       driverObj.myAbstarctMethod(100, "Knights");
    }
}
