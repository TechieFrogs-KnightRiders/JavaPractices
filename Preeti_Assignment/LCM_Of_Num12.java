public class LCM_Of_Num12 {
    public static void main(String[] args) {
        int x = 16, y = 12;
        int i = 2;
        int l = 1;
        while(x!=1 || y!= 1)
        {
            while(x%i==0 || y%i==0)
            {
                l*=i;
                if(x%i==0)
                    x/=i;
                if(y%i==0)
                    y/=i;
            }
            i++;
        }
        System.out.println("LCM of numbers is : "+l);
    }
    
}
