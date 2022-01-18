import java.util.Scanner;

public class SwapingNumber {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int a;
        int b;
        int t;
        do{
            System.out.println("Enter A value");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not a valid Number . Input a valid number");
                scannerObj.next();
            
            }
            a = scannerObj.nextInt();

        }while(a <= 0);

            
            do{
                System.out.println("Enter B value");
                while(!scannerObj.hasNextInt())
                {
                    System.out.println("This is not a valid Number . Input a valid number");
                    scannerObj.next();
                }
                b = scannerObj.nextInt();
            }while(b <= 0);

            
             t = a;
             b = t;
             a = b;
             
            System.out.println("Swaping of Two Numbers : "+ a +" , "+ b);
            scannerObj.close();

        }


        
    }
    

