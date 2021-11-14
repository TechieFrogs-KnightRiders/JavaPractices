public class primeno {
    public static void main(String[] args) {
        int i =7;
        int n =2;
        boolean prime = true;
        while (i>=n){
            //System.out.println("In while");
            if (i%n == 0)
            {
                //System.out.println("In if");
                System.out.println(i+ " - the number is not prime");
                prime = false;
                break;
                                              
            }  
           //System.out.println("after if"); 
            n++;        
        } 
            if  (prime==true)
            {
            System.out.println(i + " - the number is prime ");
            
            }    
    }
}