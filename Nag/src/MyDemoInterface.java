public interface MyDemoInterface {
    int i = 10; // public static final int i = 10;

    void display(); // public abstract void display(); 

    void newDisplay();

    //MyDemoInterface(){  Cannot have constructors for interfaces

    //}

    public static void main(String[] args) {
        AbstractClassDriver absObj = new AbstractClassDriver();
        absObj.display();
       // MyDemoInterface inteObj= new MyDemoInterface();
    }
}
