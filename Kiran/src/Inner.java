import java.util.Scanner;

public class Inner {
    int s = 44;
    
    
    void display(){
        System.out.println("In outer class");

    }
    class Inner1{
        int k;
        void innerdisplay(){
            System.out.println("In inner class "+ s);
           /* Scanner scannerObj = new Scanner(System.in);
            do{
                System.out.println("Enter Number");
                while(!scannerObj.hasNextInt());
                {
                    System.out.println("This is not a valid Number enter a valid number");
                    scannerObj.next();
                }
                k = scannerObj.nextInt();
                
            }while(k <= 0);
            
            if(k% 2 == 0)
            System.out.println(k+" Its Even Number");
            else
            System.out.println(k+" Its Odd Number");
            scannerObj.close();*/

        }
        
    }
    static class Inner2{
       static  int l = 143;
        static void inner2display(){
             System.out.println("In Static class");
         }
    }
    public static void main(String[] args) {
        Inner outerObj = new Inner();
        outerObj.display();
        Inner1 innerObj = outerObj.new Inner1();
        innerObj.innerdisplay();
        Inner2.inner2display();



        
    }
     
        
        
    }

    

   
    

