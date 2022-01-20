import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String str = "Hello 123 Knight Riders, This is our step - 1 programme&";
        Scanner scannerObj = new Scanner(str);
        scannerObj.useDelimiter(",");
        System.out.println("1 "+scannerObj.next());
        System.out.println("2 "+scannerObj.next());
        System.out.println("3 "+scannerObj.next());
        System.out.println("4 "+scannerObj.next());

        //System.out.println("Enter value for a:");
        //int a = scannerObj.nextInt();
        //if(scannerObj.hasNextInt()){
       //     System.out.println("We have another token ");
       // }
        //scannerObj.useDelimiter(".");
       // System.out.println(scannerObj.delimiter());
       // System.out.println("Enter 3rd token :");
      //  int z = scannerObj.nextInt();
      //  int l = scannerObj.nextInt();
      //  int c = a + b;
      //  System.out.println("sum value is "+c);
      //  System.out.println("Enter float: ");
      //  float f = scannerObj.nextFloat();
      //  System.out.println("Enter boolean");
      //  boolean b1 = scannerObj.nextBoolean();
      
     // scannerObj.useDelimiter("'");
      //  System.out.println("Enter string value:");
      //  String s = scannerObj.next();
       // String s2 = scannerObj.next();
      //  System.out.println("entered string is "+s);
       // System.out.println("Enter string value using nextline:");
      //  String s1 = scannerObj.nextLine();
      //  System.out.println("Enterd line is "+s1);
        scannerObj.close();


    }

    static long validate(Scanner scannerObj){
        long num;
        //Scanner scannerObj = new Scanner(System.in);
        do 
        {
            System.out.println("Enter the positive number");
            while (!scannerObj.hasNextLong())
            {
                System.out.println("This is not a number. Please enter number" );
                scannerObj.next();
            }
            num = scannerObj.nextLong();
        } while (num <= 0);
        
        return num;
    }
}
