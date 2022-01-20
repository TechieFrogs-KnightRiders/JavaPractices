public abstract class AbstractClassDemo extends AccessModifiersDemo{

    int i; 

    boolean b;

    void display(){
        System.out.println("In instance method");
    }

    abstract void abstractMethod();

    abstract void myAbstarctMethod(int k, String s);

    static void staticMethod(){
        System.out.println("In static method");
    }

    final void finalMethod(){
        System.out.println("In final method");
    }

    AbstractClassDemo(){
        System.out.println("In Abstract Class constructor");
    }

    public static void main(String[] args) {
        //AbstractClassDemo absObj = new AbstractClassDemo();
        //AbstractClassDriver driverObj = new AbstractClassDriver();
        //driverObj.myAbstarctMethod(10,"Riders");
        AbstractClassDemo absObj = new AbstractClassDemo() {

            @Override
            void abstractMethod() {
                // TODO Auto-generated method stub
                
            }

            @Override
            void myAbstarctMethod(int k, String s) {
                // TODO Auto-generated method stub
                
            }
            
        };

        absObj.abstractMethod();
        absObj.finalMethod();

    }
}
