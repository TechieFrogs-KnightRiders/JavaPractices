import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        

        
        System.out.println("Enter Old Password");
        String txt = scannerObj.nextLine();
        StringBuffer newtxt = new StringBuffer(txt);
        
        for(int i=0;i<txt.length();i++){

            if(Character.isLowerCase(txt.charAt(i))){
                newtxt.setCharAt(i,Character.toUpperCase(txt.charAt(i)));
            }
            else if(Character.isUpperCase(txt.charAt(i))){
                newtxt.setCharAt(i,Character.toLowerCase(txt.charAt(i)));
            }

        }
        System.out.println("New Password is : "+newtxt);
        scannerObj.close();
    }
}
        


        
            
        
    

