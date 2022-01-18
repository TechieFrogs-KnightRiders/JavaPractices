import java.util.Scanner;
public class WiproCodingQuestion7 {
    public static void main(String[] args) {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the number of items size");
        int s=Sobj.nextInt();
        int n[]=new int[s];
        for(int i=0;i<s;i++)
         {
             n[i]=Sobj.nextInt();
         }
         System.out.println("Enter the start Index");
         int startIndex=Sobj.nextInt();
         System.out.println("Enter the end Index");

         int endIndex=Sobj.nextInt();
         for(int i=0;i<s;i++)
           {
               if(i!=startIndex)
               System.out.println(n[i]+ " ");
               else{
                   for(int j=endIndex;j>=startIndex;j--,i++)
                   {
                       System.out.println(n[j]+ " ");
                   }
                   i--;
               }
           }
        
    }
    
}
