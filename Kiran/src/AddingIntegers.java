import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter the 1st integer");
            while(!scannerObj.hasNextInt())
            {
                System.out.println( "This is not an Integer. Enter an valid Integer ");
                scannerObj.next();
            }
            a = scannerObj.nextInt();
        }while(a <= 0);
            

     
     int b;
     do{
         System.out.println("Enter 2nd Integer");
         while(!scannerObj.hasNextInt())
        {
             System.out.println("This is not an integer.Ente a valid Integer");
             scannerObj.next();
         }
         
         b = scannerObj.nextInt();
        
        }while(b <= 0);

        
        int sum = a+b;
        System.out.println("The sum of integers " + a + " & " + b + " is : "+ sum );
          scannerObj.close();
    
        }

     
    }
    

