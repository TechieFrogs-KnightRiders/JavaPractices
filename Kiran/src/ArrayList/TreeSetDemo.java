package ArrayList;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Object> tSet = new TreeSet<>();
        tSet.add(50);
        tSet.add(10);
        tSet.add(20);
        tSet.add(30);
        tSet.add(40);
        tSet.add("hi");

       // tSet.pollFirst();
       // tSet.pollLast();
        //System.out.println(tSet);
       // tSet.floor(20);
      // tSet.ceiling(50);
        

        Iterator<Object> itr = tSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


       
    }
    
}
