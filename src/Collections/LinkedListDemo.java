package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Object> inlist=new LinkedList<Object>();
        inlist.add(1);
        inlist.add(2);
       // inlist.clear();//to clear entire list
        for(int i=0;i<inlist.size();i++)
            System.out.println(inlist.get(i));
        LinkedList<String>  llist=new LinkedList<String>();
        llist.add("Polaris");
        llist.add("Lewis Center");
        llist.add("Delaware");
        llist.add(1,"Sunburry");
        llist.addFirst("Columbus");
        llist.addLast("Ongole");
        Iterator it=llist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Descending order means reverse order \n ");
        Iterator it1=llist.descendingIterator();//in reverse order it will print not like ascending descending
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("Removing process \n");
        llist.remove("Polaris");//removing specific element from list
        llist.remove(0);//remove specific index
        for(int k=0;k<llist.size();k++)
            System.out.println(llist.get(k));
        inlist.addAll(llist);
        System.out.println("updated list \n"+inlist);

     LinkedList<String> Alist=(LinkedList<String>)llist.clone();//shallow copy
        for(int i=0;i<Alist.size();i++)
            System.out.println(Alist.get(i));

        inlist.removeAll(llist);
        System.out.println("After removing list"+inlist);

        llist.removeFirstOccurrence("Sunburry");
        System.out.println("Remove FirstOccurence \n"+llist);

        llist.removeLastOccurrence("Delaware");
        System.out.println("Remove Last Occurence \n"+llist);

        llist.removeFirst();
        System.out.println("Remove First method \n"+llist);

    }
}
