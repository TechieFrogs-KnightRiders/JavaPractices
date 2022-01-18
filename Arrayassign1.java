public class Arrayassign1 {
 //copy all elements of one array into another array
 public static void main(String[]args) {
     int[]  arr1 = new int[] { 1,2,3,4,5};       //initialize array
     int[]  arr2 = new int[arr1.length];         //create array2 with arr1 size
     for(int i=0;i<arr1.length;i++)              //copy elements of arr1 to arr2
      {
          arr2[i] = arr1[i];
      }
      System.out.println("Elements of original array:"); //display elements of arr1

      for(int i=0;i<arr1.length;i++)
       {
           System.out.println(arr1[i]+ " ");
       }
       System.out.println("Elements of new array:");       //display elements of arr2
       for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]+ " ");
        }
    }
}
