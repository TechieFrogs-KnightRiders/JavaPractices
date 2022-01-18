import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter an Integer");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not an Integer . Enter an Integer");
                scannerObj.next();
           }
            num = scannerObj.nextInt();
        }while(num <= 0);
        
            if(num% 2 == 0)
         System.out.println(num +" is Even");
            else
         System.out.println(num +" is Odd");
         scannerObj.close();

        
    
    }    
}
