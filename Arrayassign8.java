public class Arrayassign8 {
       //elements of given array on ODD position
       public static void main(String[] args){
        int[] arr = new int[] {10,20,30,40,50};
        System.out.println("Elements on odd position:");
  
        for(int i=0;i<arr.length;i=i+2)                           // increment value of i by 2
          {
              System.out.println(arr[i]);
          }
  
      }
      
  }
    

