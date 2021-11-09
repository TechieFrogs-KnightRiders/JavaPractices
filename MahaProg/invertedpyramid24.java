public class invertedpyramid24 {
    public static void main(String[] args){
        for (int i=5;i>=0;i--){
           
            for(int k=0;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
            for(int j=6;j>i;j--){
                System.out.print(" ");
            }
        }
    }
    
}

