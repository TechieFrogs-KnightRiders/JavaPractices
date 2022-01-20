import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo  {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(0,30);
        vector.addElement(70);
        vector.addElement(80);

        System.out.println(vector.size());
        System.out.println("Capacity "+vector.capacity());

        ArrayList<Integer> array = new ArrayList<>();
        array.add(40);
        array.add(50);
        array.add(60);

        vector.addAll(array);
        vector.addAll(5, array);

        System.out.println(vector.size());
        vector.trimToSize();
        System.out.println("Capacity "+vector.capacity());

        System.out.println(vector.contains(40));
        System.out.println(vector.containsAll(array));

        System.out.println(vector.elementAt(6));

        Integer arr[] = new Integer[vector.size()];
        vector.copyInto(arr);
       

        vector.insertElementAt(90,8);

        vector.set(5, 100);
        
        Collections.sort(vector);

        List<Integer> list =  vector.subList(3, 10);
        
        

        System.out.println("My list elements:");
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("My vector elements:");

       // Iterator<Integer> itr = vector.iterator();
      //  while(itr.hasNext()){
      //      System.out.println(itr.next());
       // }

       Enumeration etr = vector.elements();
       while(etr.hasMoreElements()){
           System.out.println(etr.nextElement());
       }


    }
}

class OtherClass extends Vector{
    public static void main(String[] args) {
        OtherClass vector = new OtherClass();
        vector.add(10);
        vector.add(20);
        vector.add(0,30);
        vector.addElement(70);
        vector.addElement(80);
        vector.removeRange(1, 3);
        System.out.println(vector);
    }
}
