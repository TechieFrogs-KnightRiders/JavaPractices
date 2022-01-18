//ArrayList Qn13-To replace the second element of array list with specified element
import java.util.*;
public class ArrayList13 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Dog");
        l.add("Cat");
        l.add("Goat");
        l.add("Sheep"); 
        System.out.println("Original list:" +l); 
        
        String new_l = "Tiger";                         
        l.set(1, new_l);                            //1 is index of second element cat which is set to Tiger
        System.out.println("Final list after replacing second element:" +l);
    }
}
