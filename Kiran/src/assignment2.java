import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int dividend;
        do{  
            System.out.println("Enter dividend");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("Enter an valid number");
                scannerObj.next();

            }
            
            dividend = scannerObj.nextInt();
        }while(dividend <= 0);

        int divisor;
          do{
            System.out.println("Enter divisor");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("Enter a valid number");
                scannerObj.next();
            }
            divisor = scannerObj.nextInt();
            
          }while(divisor <= 0);
          int quotient = dividend / divisor;

          int remainder = dividend % divisor;

             System.out.println("Quotient is  "+quotient);

             System.out.println("Reminder is "+remainder);

        scannerObj.close(); 

    




    }    
}
