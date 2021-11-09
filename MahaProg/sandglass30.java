public class sandglass30 {
    public static void main(String args[]){
        int n=6;
        for (int i=n;i>=0;i--){
           
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        
        for (int i=0;i<=n;i++){
           
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
        
            System.out.println();
        
        }
    }
    
}
