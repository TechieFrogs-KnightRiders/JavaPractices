public class Palindrome_Num15 {
    public static void main(String[] args) {
        int num = 65756;
        int org_num = num;
        int rem = 0;
        int rev = 0;
        while(num!=0)
        {
            rem = num%10;
            rev = rev * 10 + rem;
            num/=10;
        }
        if(org_num == rev)        
            System.out.println("Number is Palindrome");
        else      
            System.out.println("Number is not Palindrome");
    }
    
}
