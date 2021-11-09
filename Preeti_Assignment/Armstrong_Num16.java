public class Armstrong_Num16 {
    public static void main(String[] args) {
        int num = 370;
        int org_num = num;
        int rem = 0;
        int sum = 0;
        while(num!=0)
        {
            rem = num%10;
            rem = rem*rem*rem;
            sum+=rem;
            num/=10;
        }
        if(org_num==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Armstrong not Number");
    }
    
}
