//ArrayList Qn21-Join two array list
import java.util.*;
public class ArrayList21 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Dog");
        a1.add("Cat");
        a1.add("Goat");
        a1.add("Sheep"); 
        System.out.println("List1:" +a1);  

       ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Black");
        a2.add("White");
        a2.add("Red");
        a2.add("Green");
        System.out.println("List2:"+a2);

        ArrayList<String> a = new ArrayList<String>();
        b.addAll(a1);                                       // add all elements of a1 in b
        b.addAll(a2);                                       // add all elements of a2 in b
        System.out.println("After joining the two array list:\n" +b);            // b= a1 elements + a2 elements
    }
    
}
