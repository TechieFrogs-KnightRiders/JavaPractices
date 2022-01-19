package AssignmentArrayLIstCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        ArrayList<String> A=new ArrayList<String>();
        A.add("Congress");
        A.add("Janasena");
        A.add("TeluguDesham");
        A.add("BJP");
        A.add("x");
        System.out.println("Before Sorting elements"+A);
        Collections.sort(A);

       System.out.println("After Sorting "+A);

       Collections.sort(A,Collections.reverseOrder());
       for(String s:A){
           System.out.println(s);
       }
       System.out.println("Size of ArrayList "+A.size());
    A.spliterator();
/*

        Scanner scanner = new Scanner(System.in);
        int numOfBlocks = scanner.nextInt();
        int weightArray[] = new weightArray[A];
        for(int i=0;i<numOfBlocks;i++)
        {
            weightArray[i] = scanner.nextInt();
        }
        scanner.close();
*/

    }
}
