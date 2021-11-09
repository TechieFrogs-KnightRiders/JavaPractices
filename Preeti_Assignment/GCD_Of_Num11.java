public class GCD_Of_Num11 {
    public static void main(String[] args) {
        int x = 16, y = 32;
        int low = (x<y)?x:y;
        int i = 2;
        int g = 1;
        while(i<=low)
        {
            while(x%i==0 && y%i==0)
            {
                g*=i;
                x/=i;
                y/=i;
            }
            i++;
        }
        System.out.println("LCM of numbers is : "+g);
    }
    
}
