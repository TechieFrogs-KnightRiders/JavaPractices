package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Assign2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(10);
        lst.add(30);
        lst.add(5);
        lst.add(40);
        lst.add(20);
        System.out.println("Array List "+lst);

       lst.add(5, 50);
       System.out.println("Adding an element at last  \n"+lst);

       Collections.sort(lst);
       System.out.println("Array List in Accending Order \n"+lst);

       Collections.reverse(lst);
       System.out.println("Array List afer Reversing \n"+lst);

       System.out.println("Size of the Array List "+lst.size());

       Collections.sort(lst, Collections.reverseOrder());
       System.out.println("Array List in Desecending order \n"+lst);


      
    }
    
}
