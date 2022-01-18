public class Array4 {
  //Returning array from method
  public static int[] m1()
  {
      return new int [] {10,15,60,30,100};
  }
  public static void main (String[] args){
      int arr[] = m1 ();
      for(int i=0; i<arr.length;i++)
      System.out.println(arr [i]);


  }

}
