import java.util.*;
public class ArrayListCoding2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Delhi");
        l.add("Mumbai");
        l.add("Kolkata");
        l.add("Chennai");
        l.add("Hyderabad");
        l.add("x");
        System.out.println("Original array list:\n" +l);

        Collections.sort(l);
        System.out.println("After sorting:"+l);

        Collections.sort(l,Collections.reverseOrder());
        for(String str:l)
         {
             System.out.println( str);
         }
         System.out.println("size of array list: " +l.size()); 
         

        l.trimToSize();
         System.out.println("after trim :" +l); 


         Collections.sort(l,Collections.reverseOrder());
        for(String str:l)
         {
             System.out.println( str);
         }
         

         


    }

    
}
