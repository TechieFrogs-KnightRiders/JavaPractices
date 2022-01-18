

public class StringMethods {
    public static void main(String [] args){

        

        String s = "Priya";                       //charAt(int index) method
        System.out.println(s.charAt(2));    
       
       

        String s1 = "Seeta";                        //concat(string s)method 
        s1=s1.concat("Geeta");                       // Alternatively, s= s+ "Geeta"; also, s+ = "Geeta";
        System.out.println(s1);


       String s2= "GOPAL";                               //boolean equals(object o)
       System.out.println(s2.equals("gopal"));           //to chk equality of string objects
      System.out.println(s2.equalsIgnoreCase("gopal")); //equalsIgnoreCase, case is ignored ( ex- username) 


     String s3= "";                                     // boolean isEmpty()
     System.out.println(s3.isEmpty());

     String s4 = "Priya";
     System.out.println(s4.isEmpty());


     String s5 = "Rainbow";                              // int length() -string method but int length- array length
     System.out.println(s5.length());


       String s6 = "banana";                               // replace(char old,char new)
       System.out.println(s6.replace('a','b'));    
      
      
      String s7 = "aeroplane";                      //substring(int beginIndex)-from begin index to end of string
      System.out.println(s7.substring(3));         // from/includes 3rd index to end string

      String s8 = "aeroplane"; 
      System.out.println(s8.substring(3,6));       // substring(int begin,int end)- from begin index to (end-1)index  (important)


      String s9 = "eggitarian";                            // int indexOf(char ch)
      System.out.println(s9.indexOf('t'));            
      System.out.println(s9.indexOf('p'));            // if the character is not present then output is -1
      System.out.println(s9.indexOf('g'));              //if same char is present 2 or more times,then 1st occurance index is taken

      
      String s10 = "LAptoP";                          // toLowerCase()
      System.out.println(s10.toLowerCase());

      String s11 = "LAptoP";                          // toUpperCase()
      System.out.println(s11.toUpperCase());

      String s12 = " Sachin    Tendulkar  ";          //trim()  - removes extra/empty spaces in the string only at the beginning and ending .
      System.out.println(s12.trim());                 // inbetween empty space cant be removed by trimming

    

       String s13= "English";                            //returns d same interned string
       System.out.println(s13.intern());




       


    }
    
}
