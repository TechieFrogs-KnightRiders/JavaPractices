public class HW9 {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
         int large = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large)
            large = arr[i];
        }
        System.out.println("The largest number is : "+ large);
    }
    
}
