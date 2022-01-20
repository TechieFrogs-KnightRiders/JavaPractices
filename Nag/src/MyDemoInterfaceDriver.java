public abstract class MyDemoInterfaceDriver  implements MyDemoInterface, MyInterface1, MyInterface2{

    abstract void helloMethod();
    public static void main(String[] args) {
       // MyDemoInterfaceDriver demoObj = new MyDemoInterfaceDriver();
      //  demoObj.display();
        System.out.println(MyDemoInterface.i);
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("In display interface method");
        
    }

}

class MyNewClass extends MyDemoInterfaceDriver implements MyDemoInterface {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("In display");
        
    }

    @Override
    public void newDisplay() {
        // TODO Auto-generated method stub
        System.out.println("In new display");
    }

    @Override
    public void myDisplay() {
        // TODO Auto-generated method stub
        System.out.println("In my Display");
    }

    @Override
    void helloMethod() {
        // TODO Auto-generated method stub

        System.out.println("In Hello");
        
    }

    public static void main(String[] args) {
        MyNewClass myObj = new MyNewClass();
        myObj.newDisplay();
        myObj.display();
        myObj.myDisplay();
        myObj.helloMethod();
        System.out.println(MyInterface1.NUMBER+"  "+MyInterface2.NUMBER);
        MyInterface1 myInterfaceObj = new MyInterface1() {

            @Override
            public void myDisplay() {
                // TODO Auto-generated method stub
                System.out.println("In my Display from anonymous");
            }
            
        };
        myInterfaceObj.myDisplay();
    }
    

}