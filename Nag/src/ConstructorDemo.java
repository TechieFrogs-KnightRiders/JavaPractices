 class ConstructorDemo {
    int l;
    float f = 10.01f;
    public static void main(String[] args) {
        ConstructorDemo consObj = new ConstructorDemo();
        
        System.out.println(consObj.l);
        ConstructorDemo consObj1 = new ConstructorDemo(1000);
        System.out.println(consObj1.l);
        ConstructorDemo consObj2 = new ConstructorDemo(300.70);
        System.out.println(consObj2.l);


        ConstructorDemo conObj3 = new ConstructorDemo(true);

        System.out.println("After instance f = "+conObj3.f);
    }

     ConstructorDemo(){  // Constructor -  No arg constructor 
        this(200, "Knights");
        //this();
        l = 100; // initializing the variable
        System.out.println("In my constructor 1");
    }

    ConstructorDemo(int i){ // Parameterized constructor
        //this();
        l = i;
        System.out.println("In int constructr");
       // ConstructorDemo();
    }

    ConstructorDemo(double k){ // Parameterized constructor
        this(100);
        System.out.println("In string constructor");
        l = 5000;
    }

    // Constructor will be called by checking 
    // 1. Existence of the constructor
    // 2. Checks the number of args / parameters
    // 3. If having same number of params, then checks for the type of the parameter. Based on this it will execute
    // 4. No duplicate constructors allowed
    // 5. At an instant only single constructor will be called

    // 6 . If you have any constructors defined then compiler wont provide us with default constructor

    ConstructorDemo(int i, String k){
        this(k,i);
        System.out.println("In consturctor and values are "+i+"  "+k);
    }
    // Overloading
    // 1. Different number of args
    // 2. Different type of args
    // 3. Change in the order of args

    ConstructorDemo(String k, int i){
        this(600);
        System.out.println(k+"  "+i);
       // return "Nag";
    }

   // ConstructorDemo(){ // Default Constructor - This is taken care by Compiler
        // It is a no arg constructor and having no statements i.e., empty
    //}
    void ConstructorDemo(){ // No error only shows warning - This method has a constructor name

    }

    private ConstructorDemo(boolean f){
        //this.f = f; //  this keyword refers to this instance element -  differentiate local and instance variables when having same name
        System.out.println("In construtctor="+f);
    }


}

class Product{
    int product;
    int a, b;
    public static void main(String[] args) {
        //ConstructorDemo conObj = new ConstructorDemo(true);
        //System.out.println(conObj.f);

        Product pObj = new Product(10, 50);
        pObj.product = pObj.a * pObj.b;
        System.out.println(pObj.product);
    }

    Product(int a, int b){
        //int c ;
        //System.out.println(c);
        product = a * b;
    }


}
