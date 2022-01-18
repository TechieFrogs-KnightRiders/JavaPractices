public class Arrayassign7 {
    //elements of given array on EVEN position
      public static void main(String[] args){
      int[] arr = new int[] {10,20,30,40,50};
      System.out.println("Elements on even position:");

      for(int i=1;i<arr.length;i=i+2)                    // first elements position is 1,inc value of i by 2
        {
            System.out.println(arr[i]);
        }

    }
    
}
