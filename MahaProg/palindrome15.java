public class palindrome15 {
    public static void main(String[] args){
        int n=131,rem,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
           n= n/10;
        }
        System.out.println(sum);

    }
}
