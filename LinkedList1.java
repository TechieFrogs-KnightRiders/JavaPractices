/*import java.util.*;
//LinkedList Qn1-Append the specified element to the end of a Linked list
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>l  = new LinkedList<String>();
        l.add("Sun");
        l.add("Moon");
        l.add("Stars");
        l.add("Sky");
        l.add("Planets");
        System.out.println("Linked list: "+l)  ;        
    }    
}  */




//2.Append the specified element to the end of a Linked list
/*import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>l  = new LinkedList<String>();
        l.add("Sun");
        l.add("Moon");
        l.add("Stars");
        l.add("Sky");
        l.add("Planets");
        System.out.println("Linked list: "+l);
        for(String element:l)
          {
              System.out.println(element);
          } 
        }
    }  */


    //Question3-Iterate through all elements in a linked list starting at a specified position
  /*  import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>l  = new LinkedList<String>();
        l.add("Sun");
        l.add("Moon");
        l.add("Stars");
        l.add("Sky");
        l.add("Planets");
        System.out.println("Linked list: "+l);

        Iterator itr = l.listIterator(2);
        while(itr.hasNext())
        {
        System.out.println(itr.next());
        }
    }
}    */




//Qn4 - Iterate a linked list in reverse order
import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>l  = new LinkedList<String>();
        l.add("Sun");
        l.add("Moon");
        l.add("Stars");
        l.add("Sky");
        l.add("Planets");
        System.out.println("Linked list: "+l);

        Iterator itr = l.descendingIterator();
        while(itr.hasNext())
          {
              System.out.println(itr.next());
          }
        }
    }





