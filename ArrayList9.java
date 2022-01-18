
  // Arraylist9 Question- Shuffle elements in a Array list:-
     import java.util.*;
     public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Dog");
        l1.add("Cat");
        l1.add("Goat");
        l1.add("Sheep"); 
        System.out.println("List1:" +l1);  
         System.out.println("List before shuffling:\n" + l1);
      Collections.shuffle(l1);
      System.out.println("List after shuffling:\n" +l1);  
    }
} 





     /* ArrayList10 Question- Reverse elements in a array list
      import java.util.*;
     public class ArrayList9 {
    public static void main(String[] args) {
     ArrayList<String> l2 = new ArrayList<String>();
        l2.add("Black");
        l2.add("White");
        l2.add("Red");
        l2.add("Green");
       System.out.println(l2);
      Collections.reverse(l2);
      System.out.println("List after reversing:\n" +l2);  



    }
    
}   */
