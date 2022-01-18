public class Arrayassign9 {
    //to find the largest element in an array
    public static void main(String[] args){
        int[] arr = new int[]  {56,24,67,89,31};
        int max = arr[0];                                //initialize max with first element of array
        for(int i=0;i<arr.length;i++)
          {
              if(arr[i]>max)                             //compare elements of array with max
               max = arr[i];
          }
          System.out.println("Largest element in the given array is:" +max);
    }
    
}
