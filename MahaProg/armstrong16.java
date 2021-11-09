public class armstrong16 {
    public static void main(String[] args){
        int n=153,rem=0,sum=0;
       int num=n;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
       if(sum==num)
       {
           System.out.println("armstrong");
       }
       else{
           System.out.println("not armstrong");
       }
    }
}
