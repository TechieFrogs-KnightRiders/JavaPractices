 public class ClassDemo {  // ur main class and file name should be same
    static int l  = 100;  // memory allocation in stack and will be done only once. Class varaibles
    int k = 100; // instance variables
    public static void main(String[] args) {  // behaviour
        int i = 10;  // data members
        ClassDemo classObj = new ClassDemo(); // name of object - is Identity - Memory will get allocated in the heap area for the varaiables and methods

        classObj.k = 20; // data memebers - state 
        classObj.display(); // behaviour

        System.out.println("K value for 1st obj: "+classObj.k+"  static l = "+classObj.l);

        ClassDemo classObj2 = new ClassDemo(); // it creates new memory in the heap again for varaiables and methods
        classObj2.display(); 
        classObj.l = 200;
        System.out.println("K value for 2nd obj: "+classObj2.k+"  static l = "+classObj2.l);

        { // anthing defined in between curly braces we call them blocks

        }

        ClassDemo classObj3 = new ClassDemo();
        classObj3.display();
        ClassDemo.l = 300;
        System.out.println("K value for 3rd obj: "+classObj3.k+"  static l = "+classObj3.l);

        System.out.println("L value from obj1 = "+classObj.l);

        TestClass testObj = new TestClass();
        testObj.newDisplay();

        Test2 tObj = new Test2();
        tObj.helloAll();
        tObj.helloAll();
        tObj.helloAll();
        tObj.helloAll();
        

    }

    void display(){  //instance method
        System.out.println("In method");
    }
}

// ur file can contain n number of classes but only one public class - it should be the file name class
// Its not mandate to have main method
// Its not mandate to have same file name class in the file
 class TestClass{  // public can be given to the class only in its own file
   void newDisplay(){
       System.out.println("In display of test class");
   }
}
