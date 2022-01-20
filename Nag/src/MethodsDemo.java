public  class MethodsDemo {

    int i = 10;
    static int j = 20;
    public void display()// header or signature
    {  //method body
        //u can write an behaviour or some set of instructions
        // u can write n numbers of statements
    }//method body

    void evenOrOdd(int num){ // in the method declaration itself u have the parameter declaration part i.e., datatype
        if(num % 2 == 0){
            System.out.println(num+" is an even number");
        }
        else
            System.out.println(num+" is an odd number");

            //return 10;
    }

    int evenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num+" is an even number");
            return num;
            
        }
        else {
            System.out.println(num+" is an odd number");
            return num;
        }
            
    }

    static String evenOddCheck(int num1, String s){ // num1 = formal parameter , in the method definition
       
        if(num1 % 2 == 0){
            System.out.println(num1+" is an even number");
            return "num";
           // break;
            
        }
        return "Nag";

       
        
    }

    static public void newDisplay(){
        System.out.println("In static ");
        
    }

    final void hi(){
        
    }

   // abstract String hello();

    public static void main(String[] args) {
       // MethodsDemo methodObj = new MethodsDemo();
        
       // int num = methodObj.evenOdd(10); // caller or calling a method - will give a value or variable but not the declaration
       
       int num = 13;
       String str = evenOddCheck(num, "Nag"); // 20 - actual parameter u will give while calling the method
       System.out.println(num+" "+str);

       MethodsDemo.newDisplay(); 
    }
}
