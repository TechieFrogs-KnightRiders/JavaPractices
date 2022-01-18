import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter");
        String str = scannerObj.nextLine();
        StringBuffer newStr = new StringBuffer(str);

        for(int i =0;i<str.length();i++){ 
            if(Character.isLowerCase(str.charAt(i))){ // checks lower case
                newStr.setCharAt(i,Character.toUpperCase(str.charAt(i))); // convert to upper case 
            }
            else if(Character.isUpperCase(str.charAt(i))){ // checks for upper case 
                newStr.setCharAt(i,Character.toLowerCase(str.charAt(i))); //converts upper to lower

            }
        }
        System.out.println(newStr);
        scannerObj.close();



        

    }
      

    
}
