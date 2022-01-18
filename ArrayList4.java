//To retrieve an element (at a specified index) from a given array list
import java.util.*;
 public class ArrayList4 {
     public static void main(String[] args) {
         ArrayList<String>l=new ArrayList<String>();
         l.add("Root");
         l.add("Stem");
         l.add("leaves");
         l.add("branches");
         l.add("flower");
         System.out.println(l);
         l.get(2);
         System.out.println(l);



      /*ArrayList5- Update a specific element by given element:-
      l.set(3,"fruit");
      System.out.println(l);*/



      /* ArrayList6- Remove the third element from a given array list:-
      l.remove(3);
      System.out.println("After removing the fourth element:\n" +l);*/



      /*ArrayList7 -To search an element in a array list:-
      if(l.contains("Stem"))
      {
          System.out.println("Element is present");
      }
      else{
          System.out.println("Element is not present");
      } */


     }
    
}
