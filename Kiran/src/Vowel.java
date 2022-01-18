import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter a character :");
         char ch = scannerObj.next().charAt(0);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            System.out.println(ch + " is an vowel");
         }else{
            System.out.println(ch + " is a consonant");
            scannerObj.close();
         }        
    }
    
}
