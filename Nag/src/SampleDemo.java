public class SampleDemo {

    int i = 10; // instance
    int j;

    static void SampleDemo(){  // cannnot use this in static context as this refers to object and static associated to class
        int i= 200; // local
       // System.out.println(this.i+"  "+i);
       System.out.println("In method");
       SampleDemo sample = new SampleDemo();
       System.out.println(sample.i);

    }

    SampleDemo(){
        int k;
        System.out.println("In constructor");
        //SampleDemo(); // can call the blocks , methods and can use all the coding paradigms
        {
            int J =10;
        }
    }


    public static void main(String[] args) {
       // this.i = 100;
       SampleDemo.SampleDemo();

      // SampleDemo sampleObj = new SampleDemo();

      // SampleDemo();
       




    }


}

class Calculator {
    int a = 10, b = 20, c, d, e;

     void operations(){ 
        c = a + b;
        d = a - b;
        e = a / b;
        //SampleDemo sample = new SampleDemo();

        //Calculator cObj = new Calculator();
    }

    Calculator(){
        a = 500;
        b = 400;
        operations(); // calling inside constructor
        Calculator calObj = new Calculator();
        System.out.println(calObj.a);
    }
    public static void main(String[] args) {
        Calculator cObj = new Calculator();
        OperatorsDemo operatorsObj = new OperatorsDemo();
       // operatorsObj.add();
        operatorsObj.subtract();
        operatorsObj.add();
        
        LoopingConstructs loopingObj =  new LoopingConstructs();
        
        cObj.operations();
        System.out.println(cObj.c);
    }
}
