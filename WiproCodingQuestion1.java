import java.util.Scanner;
public class WiproCodingQuestion1 {
 public static void main(String[] args) {
        Scanner scanobj = new Scanner (System.in);
        System.out.println("Enter the password:");
        String str = scanobj.nextLine();
        StringBuffer strobj= new StringBuffer(str);
        System.out.println("Given password:" +str);
        for(int i=0; i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
              {
                  strobj.setCharAt(i,Character.toUpperCase(str.charAt(i)));
              }
            else if(Character.isUpperCase(str.charAt(i)))
              {
                  strobj.setCharAt(i,Character.toLowerCase(str.charAt(i)));
              }

        }
        System.out.println("Reset password" +strobj);
        
           
        
    }
    
}
    

