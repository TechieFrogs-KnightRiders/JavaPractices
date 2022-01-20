package AssignmentPriorityQueue;

import java.util.Arrays;
import java.util.*;

import static java.util.Collections.reverseOrder;

public class Prog15SumofSubSequence {

           public static void main(String args[]) {
         Prog15SumofSubSequence obj=new Prog15SumofSubSequence();
               int k = 3;
               Integer[] arr = {8, 5, 9, 10, 5, 6, 21, 8};
              System.out.println("make subSequence of set with 3 length "+arr.length);
              Arrays.sort(arr);
                   System.out.println(Arrays.toString(arr));
              Arrays.sort(arr, Collections.reverseOrder());
            System.out.println("Descending order ia "+Arrays.toString(arr));
            int arrSubSeq[]=new int[k];
            int sum=0;
            for(int i=0;i<k;i++){
                arrSubSeq[i]=arr[i];
                sum=sum+arrSubSeq[i];
            }
            System.out.println(Arrays.toString(arrSubSeq));
               System.out.println("sum of sub Sequence "+sum);
           }
    }
