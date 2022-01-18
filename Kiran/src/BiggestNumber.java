import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int x,y,z;
        do{
            System.out.println("Enter the 1st number");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not a valid Number");
                scannerObj.next();
            }
            x = scannerObj.nextInt();
        }while(x <= 0);


        do{
            System.out.println("Enter the 2nd number");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not a valid Number");
                scannerObj.next();
            }
            y = scannerObj.nextInt();
        }while(y <= 0);

        do{
            System.out.println("Enter the 3rd number");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not a valid Number");
                scannerObj.next();
            }
            z = scannerObj.nextInt();
        }while(z <= 0);
        
        if(x > y && x > z)
        {
            System.out.println(x + " : is the largest number ");
        }
        else if(y > z)
        {
            System.out.println(y + " : is the largerst number");
        }
        else
        {
            System.out.println(z +" : is the largest number");
        }
       scannerObj.close();

        
    }
    
}
