public class Array2 {
    //passing of array to method
  public static void main(String args[]){
      int arr[] = {3,15,4,6,9};
      sum(arr);                                      //passing array
  }  

  public static void sum(int[]arr){
      int sum = 0;
      for(int i = 0;i< arr.length;i++)
      sum+= arr[i];
      System.out.println("sum of array values:" + sum);

  }
}
