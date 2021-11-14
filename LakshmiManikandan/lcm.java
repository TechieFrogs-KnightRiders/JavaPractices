public class lcm {
    public static void main(String[] args) {

        int num1 = 72, num2= 120;
        int gcd = 0;
    
        for(int i = 1; i <= num1 && i <= num2; ++i) {
          
          if(num1 % i == 0 && num2 % i == 0)
            gcd = i;
        }
    
        int lcm = (num1 * num2) / gcd;
        System.out.println("The LCM of " + num1+"  & " +num2+" is " + lcm);
      }
    }

