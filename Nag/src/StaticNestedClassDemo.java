public class StaticNestedClassDemo {
    int i;
    static int k;

    void display(){
        System.out.println("In display");
        NestedClass nestedObj = new NestedClass();
        nestedObj.nestedDisplay();
        StaticNestedClassDemo.NestedClass.innerStaticMethod();
        staticMethod();
        
    }

    static void staticMethod(){
        System.out.println("In static method");
        
    }
    // Static Inner or Static Nested or Nested Class
    static class NestedClass{
        int l;
        static int m = 30;

        void nestedDisplay(){
            System.out.println("In nested display");
            staticMethod();
            
            StaticNestedClassDemo staticObj = new StaticNestedClassDemo();
            staticObj.display();
        }

        static void innerStaticMethod(){
            System.out.println("In inner static method");
        }

        static void hello(){

        }

        public static void main(String[] args) {
            System.out.println("In main of nested");
        }
    }
    // Member class or Inner class
    class NonStaticClass{
        int z;
        static int k1; // Not allowed to create static elements in Non static inner classes
         static final int k = 10; // Only constants are allowed
        //static final void hello(){

      //  }
        
    }

    public static void main(String[] args) {
        StaticNestedClassDemo staticObj = new StaticNestedClassDemo();
        StaticNestedClassDemo.NestedClass nestedObj = new StaticNestedClassDemo.NestedClass();
        nestedObj.nestedDisplay();
        StaticNestedClassDemo.NestedClass.innerStaticMethod();
       // NonStaticClass nonObj = new NonStaticClass();
    }
}
