public class Arrayassign10 {
    //to find the smallest element in an array
    public static void main(String[] args){
        int[] arr = new int[] {52,24,68,88,39};
        int min = arr[0];                                //initialize min with first element of array
        for(int i=0;i<arr.length;i++)
          {
              if(arr[i]<min)                             //compare elements of array with min
               min = arr[i];
          }
          System.out.println("smallest element in the given array is:" +min);
    }
    
}
    

