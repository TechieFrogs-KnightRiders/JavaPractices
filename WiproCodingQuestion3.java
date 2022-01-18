import java.util.Scanner;
public class WiproCodingQuestion3 {
    public static void main(String[] args) {
        Scanner scanobj = new Scanner (System.in);
        System.out.println("Enter password");
        String str=scanobj.nextLine();
        System.out.println("Given password" +str);
        int specialchar=0;
        for(int i=0;i<str.length();i++)
          {
              char ch=str.charAt(i);
              if((ch>='a'  && ch <='z'))
              {
              }
              else if (ch>='0' && ch<='9')
              {
              }
              else if (ch== ' ')
              {
              }
              else
                ++specialchar;
          }
          System.out.println("number of SpecialCharacters:"+ specialchar);
    }
    
}
