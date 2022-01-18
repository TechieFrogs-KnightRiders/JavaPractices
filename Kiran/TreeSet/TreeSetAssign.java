package Kiran.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAssign {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        TreeSet<String> tSet1 = new TreeSet<>();
        tSet.add("Red");  
        tSet.add("Green");
        tSet.add("Blue");
        tSet.add("Yellow");
      System.out.println("TreeSet :"+tSet);

      System.out.println("----------");
      System.out.println("Using Iterator :");
      Iterator<String> itr = tSet.iterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
      System.out.println("----------");
      tSet1.add("Purple");
      tSet1.add("Orange");
      tSet1.add("Black");
      tSet1.add("White");
      System.out.println("TreeSet2 :"+tSet1);
      System.out.println("----------");
      System.out.println("Adding all elements :");
      tSet.addAll(tSet1);
      System.out.println(tSet);
       
      System.out.println("----------");
      System.out.println("In Reverse Order :");
      Iterator<String> itr1 = tSet.descendingIterator();
      while(itr1.hasNext()){
          System.out.println(itr1.next());
      }
          System.out.println("----------");
          System.out.println("Getting First and Last Element :");
          System.out.println(tSet.first()+","+tSet.last());

          System.out.println("----------");
          System.out.println("Cloning :");
          TreeSet<String> tSet2 = (TreeSet<String>)tSet.clone();
          System.out.println(tSet2);

          System.out.println("----------");
          System.out.println("Size Of tree Set");
          System.out.println(tSet.size());

          System.out.println("----------");
          System.out.println("Removes the first element in the TreeSet :");
          System.out.println(tSet.pollFirst());

          System.out.println("----------");
          System.out.println("Removes the Last element in the TreeSet :");
          System.out.println(tSet.pollLast());

          System.out.println("----------");
          System.out.println("Creating a TreeSet With Comparator :");
          Comparator comp = tSet.comparator();
          System.out.println(comp); //Its Only Follows Natural Ordering
          
         



     
      

         

      

      



   
    
}
}
