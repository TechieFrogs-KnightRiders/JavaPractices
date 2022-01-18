import java.util.Scanner;

public class ScannerMultiple {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int a,b,c;
        a = validate(scannerObj);

        b = validate(scannerObj);

        c = validate(scannerObj);
         
        c = a-b;
        System.out.println("sub is : "+ c );



    }
    

    static int validate(Scanner scannerObj){
       int a;
    do{
        System.out.println("Enter a number");
        while(!scannerObj.hasNextInt())
        {
            System.out.println("This is not a valid Number");
            scannerObj.next();
        }
        a = scannerObj.nextInt();
    }while(a <= 0);
    
    return a;


   }


     
     }
   

