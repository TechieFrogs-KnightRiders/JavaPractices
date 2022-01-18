//ArrayList Qn16-To copy one  array list into another
import java.util.*;
public class ArrayList16 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Dog");
        l1.add("Cat");
        l1.add("Goat");
        l1.add("Sheep"); 
        System.out.println("List1:" +l1);  

       ArrayList<String> l2 = new ArrayList<String>();
        l2.add("Black");
        l2.add("White");
        l2.add("Red");
        l2.add("Green");
        System.out.println("List2:"+l2);

        Collections.copy(l1,l2);                                  //copy L1 elements to l2
        System.out.println("\n After copying List1 to List2:");
        System.out.println("List1:" +l1);
        System.out.println("List2:" +l2); 
    }
    
}
