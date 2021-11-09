public class pyramid {
    public static void main(String[] args){
        int n=7;
        for (int i=1;i<=n;i++){
            if(i%2!=0){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
        
            System.out.println();
        }
        }
    }
    
}
