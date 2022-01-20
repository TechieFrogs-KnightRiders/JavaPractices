

public class NestedClassesDemo { // Outer class
    private int k;
    int m = 20;
    static int l = 30;
    void display(){
        InnerClass innerObj = new InnerClass();
        innerObj.innerDisplay();
       // InnerClass1 inObj = new InnerClass1();
       // inObj.inner2Display();
       NestedClassesDemo.InnerClass.DepthClass dObj = innerObj.new DepthClass();
        System.out.println("In display");
        display1(dObj);
    }

    void display1(NestedClassesDemo.InnerClass.DepthClass d1){
        d1.depth();
    }

    private class InnerClass{ // Nested / Inner class & Outer class 
        int i;
        void innerDisplay(){
            System.out.println("In inner display "+k+"  "+l+"  "+m);
           // display();
            //inner2Display();
        }

        InnerClass(){
            System.out.println("In inner constructor");
        }

        class DepthClass{
            int z;

            void depth(){
                System.out.println("In depth "+l);
            }
        }
    }

    class InnerClass1{ // nested class or Inner class
        int j; 
        void inner2Display(){
            display();
            System.out.println("In inner 2 display"+k);
        }
    }



    public static void main(String[] args) {
        NestedClassesDemo outerObj = new NestedClassesDemo();
        NestedClassesDemo.InnerClass innerObj = outerObj.new InnerClass();
        //innerObj.innerDisplay();
        NestedClassesDemo.InnerClass.DepthClass depObj = innerObj.new DepthClass();
        depObj.depth();
        
        outerObj.display();
    }
}
