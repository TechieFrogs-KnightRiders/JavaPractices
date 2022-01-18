import java.util.Scanner;

public class ScanenrDouble {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        Double x,y,z;

        x = validate(scannerObj);

    }
    

    static double validate(Scanner scannerObj){
        Double x;
        do{
           System.out.println("Enter a number");
           while( !scannerObj.hasNextDouble())
           {
               System.out.println("This is not a valid Number");
               scannerObj.nextDouble();
           }
           x = scannerObj.nextDouble();
       }while(x <= 0);
       
       return x;
    }

}
