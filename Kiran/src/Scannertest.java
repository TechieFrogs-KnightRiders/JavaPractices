import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        
        Scanner scannerObj = new Scanner(System.in);

       /* System.out.println("Enter 1st num");
        int a = scannerObj.nextInt();
        System.out.println("Enter 2nd num ");
        int b = scannerObj.nextInt();
        int c = a+b;
        System.out.println("sum : "+ c );
        System.out.println("enter name");
        String s = scannerObj.nextLine();
        System.out.println(s);*/
        System.out.println("Enter your name ");
        String name = scannerObj.nextLine();
        //System.out.println("Name : "+ name );
        System.out.println("Gender");
        char gender = scannerObj.next().charAt(0);
        System.out.println("Gender : "+ gender);
        System.out.println("Enter age ");
        int age = scannerObj.nextInt();
        System.out.println("Enter Mobile Number");
        long Mobile = scannerObj.nextLong();
        scannerObj.close();




    }
    
}
