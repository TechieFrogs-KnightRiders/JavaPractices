public class Arrayassign6 {
    //print the array elements in reverse order
    public static void main(String[] args){
        int[] arr = new int[] { 23,34,54,89,67};
        System.out.println("Original array:");
        for(int i=0; i<arr.length;i++)
          {
              System.out.println(arr[i]+" ");
          }
          System.out.println("Array in reverse order:");
          for(int i=arr.length-1;i>=0;i--)                      //loop thru array in reverse order
           {
               System.out.println(arr[i]+ " ");
           }
    }
    
}
