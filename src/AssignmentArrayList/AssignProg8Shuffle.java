package AssignmentArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;

public class AssignProg8Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> arrnub=new ArrayList<Integer>();
        arrnub.add(10);
        arrnub.add(11);
        arrnub.add(12);
        arrnub.add(13);
        arrnub.add(14);
        System.out.println("Array list is "+arrnub);
        //Prog 10 Reverse order
        System.out.println("Reverse order of Arraylist");
        ListIterator li=arrnub. listIterator(arrnub.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        //prog 11 Swapping 2 elements
        Collections.swap(arrnub,1,2);
        System.out.println("after swapping Array list is "+arrnub);
        //prog 12 Extract a portion of arraylist
        System.out.println("Extracting a portion of elements"+arrnub.subList(1,3));
        //Prog 13 Replace the sencond elements
        System.out.println("Replace value "+arrnub.set(1,200));
        System.out.println("after replacing element"+arrnub);
        //Prog 9 Shuffle
        Collections.shuffle(arrnub);
        System.out.println("After shuffling the Array list is "+arrnub);
        //Prog 14 ,15 Epmty Array List
        arrnub.clear();
        System.out.println("after clear the array"+arrnub);
        System.out.println(arrnub.isEmpty());

    }
}
