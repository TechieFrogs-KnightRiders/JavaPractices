public class HW10 {
    public static void main(String[] args) {
        int arr[] = new int[] {20,25,100,18,11};
        int small = arr[0];        for(int i=0;i<arr.length;i++){
            if(arr[i]<small)
            small = arr[i];
        }
        System.out.println("Smallest number is : "+small);
    }
    
}
