public class HW3 {
    public static void main(String[] args) {

        int arr[] = new int [] {1,2,3,4,5};

        int n = 1;

        System.out.println("1st array");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        for(int i = 0; i<n; i++){
            int j,first;

            first = arr[0];
            for(j=0; j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
       
        System.out.println("Array after left roatation ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        
    }
    
}
