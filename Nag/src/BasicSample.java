public class BasicSample {

    int j ;  // heap area: declared at the class level and can be accessed only using the instance or object of the class
    static int z ; // static and stack area

    final int y;  // its a final value that cannot be changed further

   static int m; // declaration

   final int q; // blank final varaiable

    final static int MYCONSTANT;  

    { // Instance Intitialization Block - IIB
        y = 10;

        q  =50;

        //q = 100;

    }

    static  // Static Initialization Block  - SIB
    {
        MYCONSTANT = 200;
    }

    static boolean b; // possible values: true or false

     static  public void main(String... ar) {
        //System.out.println("In main "+ar[0]);

        m = 100;  // initialization

        byte i = 10; //

        byte i3 = 20;

        //byte i4 = (byte)(i + i3);

        String s = "Nag";
        long i1 = 45654756865645654L;  // range: -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) and 4 bytes
        i = 30;
        i1 = 100;
        z  = 150;

        long l1 = 1000; // -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1) and 8 bytes

        byte b1 = -127; // -128 to 127 range and 1 byte

        short s1 = 15; // -32,768 to 32,767 range and 2 bytes

        float f = 100.00f; // 4 bytes 

        double d = 100.90; // 8 bytes

        char ch = 'A'; // single quotes //65

        char i5 = 68; // Ascii code - 67 

        System.out.println(i5);
        
        System.out.println(s1);

      /*  BasicSample basicObj = new BasicSample();
        basicObj.display();
       // basicObj.y = 100;
        System.out.println("Static value = "+BasicSample.z);

        if(true){
            int k = 20;

            System.out.println(k);
        }


       // System.out.println(k);*/
    }

     void display(){
        System.out.println(BasicSample.z);
    }

   
}
