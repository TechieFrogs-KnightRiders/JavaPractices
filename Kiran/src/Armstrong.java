import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number, originalNumber, remainder, result = 0;
    Scanner scannerObj = new Scanner(System.in);
    do{
        System.out.println("Enter the number: ");
        while(!scannerObj.hasNextInt()){
            System.out.println("Enter the valid number");
            scannerObj.next();

        }
        number = scannerObj.nextInt();
    }while(number<=0);

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
            scannerObj.close();
    }

    
}
