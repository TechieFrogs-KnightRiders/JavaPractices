public class Arrayassign3 {
    //left rotate the elements of an array
    public static void main(String[] args){
        int[] arr=new int[]{10,20,30,40,50};
        int n=4;                                      //let, no of times left rotate is 4 ie n=4 (n can be any no)
        System.out.println("original array:");
        for(int i=0;i<arr.length;i++)
         {
             System.out.println(arr[i]+ " ");
         }
         for(int i=0;i<n;i++)                       //rotate the given array by n times to left
            {                              
             int j,first;
             first=arr[0];                           //stores first element of array
             for(j=0;j<arr.length-1;j++){
                 arr[j] = arr[j+1];                   //shift element of array by one
             }
             arr[j]=first;
            }
            System.out.println("Array after left rotation:");
            for(int i=0;i<arr.length;i++){
               System.out.println(arr[i] + " ");
            }
              

          }
    }
    

