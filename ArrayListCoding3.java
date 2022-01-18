import java.util.*;
public class ArrayListCoding3 {
    
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
      l.add("English");
      l.add("Hindi");
      l.add("Math");
      l.add("Science");
      l.add("Telugu");
      System.out.println("Original array list:\n" +l);


      Collections.reverse(l);
      Iterator itr = l.iterator();
         while(itr.hasNext())
          {
           System.out.println(itr.next());    // reverses the contents of string array
          }
          System.out.println("Original array list:\n" +l);
       Collections.sort(l,Collections.reverseOrder());
         for(String str:l)
            {
                System.out.println(str);
           }
           System.out.println("Checking if empty or not:" + l.isEmpty());        //l.isEmpty() - to check if a list is empty or not
        l.removeAll(l);                                                       //removeAll(l)- to empty/remove all the elements in a list
        System.out.println("Arraylist after removing all elements" +l);
        System.out.println("Checking if empty or not:" +l.isEmpty());  
    
        }
    
}
