public class OperatorsDemo {

  OperatorsDemo(){
    System.out.println("In my operartors demo constructor");
  }

  void add(){

  }

  void subtract(){
    
  }
    public static void main(String[] args) {
        int i = -10;

       // i++; // i = i + 1;  // Post Increment

       // i--;  // i = i - 1; Post Deccrement

      //  System.out.println(i++ + ++i); // prefix or pre Increment 10 + 12 = 22

        System.out.println(--i); 

        System.out.println(i);

        //Bitwise complement(~)

        System.out.println(~i); // 0010 = 1101

        boolean b = false;

        System.out.println(!b);

        System.out.println(20<<3);  //  left shift operator - 10 * 2^2 = 40;  20 * 2^3 = 20 * 8 = 160

        System.out.println(10>>3);  // right shift operator - 10 / 2^3 = 10 / 8 = 1

        // Bitwise Operators ( & and |) =  boolean 
        int a  = 10, b1 = 20, c = 30;

       // System.out.println(a < b1 & b1 < c); //  true & true = true

       // System.out.println(a < b1 | b1 > c); // true | false = true

        // Logical Operators( && and ||) = boolean

        System.out.println(a < b1 | b1++ > c); // false &&   = false

        System.out.println(b1);

      //  System.out.println(a < b1 || b1 > c); // true

      int l = (a < b1)? 10 : 20; //  ternary operator which deals with 3 operands

     // System.out.println(l);

      a+=20; // a = a + 20;

      a-=10; // a = a -  10;

     // System.out.println(a);

     System.out.println( a & b1); // 20 - 10100 &  
     //                                   10101 = 10100

     System.out.println(a+"  "+b1);
     System.out.println(a | b1); // 10100 | 
     //                             10101 = 10101

     





    }
}
