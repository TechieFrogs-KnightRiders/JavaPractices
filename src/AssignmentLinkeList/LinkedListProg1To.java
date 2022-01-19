package AssignmentLinkeList;

import java.awt.desktop.SystemSleepEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProg1To {
    public static void main(String[] args) {
        LinkedList<String> LArr=new LinkedList<String>();
        LArr.add("Grace");
        LArr.add("Medows");
        LArr.add("Alum Creek");
        //Prog 2 iterating all elements
        Iterator LArrItr=LArr.iterator();
        while(LArrItr.hasNext()) {
            System.out.println(LArrItr.next());
        }
           //Prog 3 To Print Specified index
        System.out.println("To Print Specified index");
            ListIterator<String> LArr1= LArr.listIterator(1);

        while(LArr1.hasNext()) {
            System.out.println(LArr1.next());
        }
        //Prog 4 reverse oreder
        System.out.println("Reverse order \n");
        Iterator i=LArr.descendingIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        //Prog 5 insert a specified element in a specified position
        LArr.add(1,"vibgyor");
        //Prog 6 inset element to list for 1st and last position
        LArr.addFirst("AMMA");
        LArr.addLast("Cheshire");
        //Prog 9 adding some elements to the specified position into a list
        LinkedList<String> LArr2=new LinkedList<String>();
        LArr2.add("Vignana Bharathi");
        LArr2.add("Vidya Bharathi");
        System.out.println("Adding list to another list \n");

        LArr.addAll( 1,LArr2);
        for(int l=0;l<LArr.size();l++){
            System.out.println(LArr.get(l));
        }
        System.out.println("get the FirstOccurance "+LArr.getFirst());
        System.out.println("get the LastOccurance "+LArr.getLast());


    }
}
