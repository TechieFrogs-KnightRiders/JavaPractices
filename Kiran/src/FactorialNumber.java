import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        
        int num,fact = 1,i;
        
        do{
            System.out.println("Enter an value");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("Entered an invalid number. Enter valid number  "  );
                scannerObj.next();
            }
          num = scannerObj.nextInt();
         
        }while(num <= 0);
        
        for(i=1;i<=num;i++){
            fact = fact*i;
            
        } 
        System.out.println("the factorial of number is : "+fact);
        

    }
    
}
