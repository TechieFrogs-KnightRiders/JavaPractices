public class gcd {
    public static void main(String[] args) {

        int num1 = 18, num2 =81;
        int gcd = 0;
    
        for (int i = 1; i <= num1 && i <= num2; ++i) {
    
          if (num1 % i == 0 && num2 % i == 0)
            gcd = i;
        }
    
        System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd);
      }
}
