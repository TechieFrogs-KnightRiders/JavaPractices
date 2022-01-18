public class Array1 {
  public static void main(String[]args) {
      int[] arr;                                     //declaring an array of integers
      arr = new int [5];                             //memory allocation for 5 integers
      arr[0] = 10;                                   //initializing the first element of the array
      arr[1] = 20;
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;
      
      for(int i=0; i<arr.length; i++)
      System.out.println("Element at index" + i + ":" + arr[i]);


  } 
}
