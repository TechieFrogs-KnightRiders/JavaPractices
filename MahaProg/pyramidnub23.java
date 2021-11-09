public class pyramidnub23 {
    public static void main(String[] args){
        int n=7;
        int l=0;
        for (int i=1;i<=n;i++){
            if(i%2!=0){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k>(i+1)/2)
                    l--;
                else
                    l++;
                System.out.print(l + " ");
            }
        
            System.out.println();
        }
    }
        
    } 
       
}
