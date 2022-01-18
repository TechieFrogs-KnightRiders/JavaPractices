// Arraylist11 Question- Swap 2 elements in an Array list:-
import java.util.*;
public class ArrayList11 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
      l.add("English");
      l.add("Hindi");
      l.add("Math");
      l.add("Science");
      l.add("Telugu");

      System.out.println("Array list before swap:");
      for(String A:l)
      {
          System.out.println(A);
       }
       Collections.swap(l,2,4);              //(2,4) - swapping 2nd index(3rd element) to 4th index(5th element)
       System.out.println("Array list after swap:");
       for(String B:l)
       {
           System.out.println(B);
       }

        
    }
    
}
