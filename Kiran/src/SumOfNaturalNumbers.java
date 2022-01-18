import java.util.Scanner;

public class SumOfNaturalNumbers {
      public static void main(String[] args) {
          Scanner scannerObj = new Scanner(System.in);
          int a;
          int num  ;
         int  sum = 0;
        do{
             System.out.println("Enter number");
             while(!scannerObj.hasNextInt())
            {
                 System.out.println("This is not a number . Enter a valid number ");
                 scannerObj.next();
            }
             num = scannerObj.nextInt();
        }while(num <= 0); 
         
         
        for(a = 1; a <= num; ++a)
        {
            sum = sum + a;
        }
       
         System.out.println("The sum of first "+ num +" Natural Numbers"+ " is "+ sum);
    }    
    
}
