import java.util.Scanner;

public class ScannerInputValidation {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        //System.out.println("Enter int value");
        int num;
        
        num = validate(scannerObj);

        int k = validate(scannerObj);

      //  int j = scannerObj.nextInt();


       /* int add = num + k;

        float f = floatValidate(scannerObj);
        
        scannerObj.nextLine();

        System.out.println("Enter string");

        String s = scannerObj.nextLine();

        String s1 = scannerObj.nextLine();

        System.out.println("My addition value is "+add);
        System.out.println("My float value is "+f);
        System.out.println("My string value "+s);
        System.out.println("My string1 value "+s1);*/
        System.out.println("My value is = "+num+"  "+k);
        scannerObj.close();
    }


    static int validate(Scanner scannerObj){
        int num;
        //Scanner scannerObj = new Scanner(System.in);
        do 
        {
            System.out.println("Enter the positive number");
            while (!scannerObj.hasNextInt())
            {
                System.out.println("This is not a number. Please enter number" );
                scannerObj.next();
            }
            num = scannerObj.nextInt();
        } while (num <= 0);
        //scannerObj.close();
        return num;
       
    }

    static float floatValidate(Scanner scannerObj){
        float num;
        //Scanner scannerObj = new Scanner(System.in);
        do 
        {
            System.out.println("Enter the positive number");
            while (!scannerObj.hasNextFloat())
            {
                System.out.println("This is not a number. Please enter number" );
                scannerObj.next();
            }
            num = scannerObj.nextFloat();
        } while (num <= 0);
        //scannerObj.close();
        return num;
       
    }
}
