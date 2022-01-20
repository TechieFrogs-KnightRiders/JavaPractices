package AssignmentPriorityQueue;

import java.util.Arrays;

public class MaxProd {
    public static void main(String[] args) {
        int[] arr={3,4,5,2};
        Arrays.sort(arr);
        for(int i:arr) {
            System.out.println(i);
        }
        int a=arr.length;
        int prod;
        prod=(arr[a-1]-1)*(arr[a-2]-1);
        System.out.println(prod);

    }
}
