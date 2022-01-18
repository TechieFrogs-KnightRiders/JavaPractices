import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        
    
    Scanner scannerObj = new Scanner(System.in);
    char ch;
    System.out.print("Enter a letter: ");
    while(scannerObj.hasNext())
          
    {

       ch = scannerObj.next().charAt(0);

        if (ch =='a'||ch =='A'||ch =='e'||ch =='E'||ch =='i'||ch =='I'||ch =='o'||ch =='O'||ch =='u'||ch =='U')
        {
            System.out.println(ch + " is a vowel");
        }
        else if(Character.isLetter(ch)){
            System.out.println(ch + " is a consonant");
            
        }

        else {

            System.out.println(ch + " is an invalid Alaphabet . Enter a valid Alaphabet");
        
            }

    
    }
    
}

}
