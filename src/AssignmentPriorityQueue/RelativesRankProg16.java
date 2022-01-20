package AssignmentPriorityQueue;

import java.util.Arrays;

public class RelativesRankProg16 {

    public static void main(String[] args) {
       // 1. sort array
        //2 iterate through array
        //3 print each value using swithc case 1,2,3 - medals default - print value
        int array[]={4,3,5,1,2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int value=0;
        for(int i=0;i<array.length;i++){
           value= array[i];
           switch (value){
               case 1:
                   System.out.println(value+" : Gold Medal");
                   break;
               case 2:
                   System.out.println(value+" : Silver Medal");
                   break;
               case 3:
                   System.out.println(value+" : Bronze Medal");
                   break;
               default:
                   System.out.println(value);
           }
        }

    }

}
