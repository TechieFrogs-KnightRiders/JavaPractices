public class Arrayassign4 {
    //print the duplicate elements in array -numbers that repeat
    public static void main(String[] args){
        int[] arr = new int []{ 1, 3, 6, 7, 3, 7, 9, 10, 1};   //initialization
        System.out.println("Duplicate elents in the array:");
        for(int i=0;i<arr.length;i++)                             //search for duplicate element
         {
             for(int j=i+1;j<arr.length;j++)
               {
                   if(arr[i]==arr[j])
                   System.out.println(arr[j]);
               }
         }

    }
    
}
