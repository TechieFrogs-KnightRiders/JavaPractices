public class prime14 {
    public static void main(String args[]){
        int n=15,i,flag=0;
        int m=n/2;
        for(i=2;i<=m;i++){
            if(n%i==0)
            {
                System.out.println("not prime nub");
                flag=1;
                break;
            }
        }
            if(flag==0){
                System.out.println("prime nub");
            }
        

    }
    
}
