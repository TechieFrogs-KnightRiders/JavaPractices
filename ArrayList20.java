//ArrayList20- Clone an array list to another arraylist
import java.util.*;
public class ArrayList20 {
    public static void main(String[] args) {
        ArrayList<String> l= new ArrayList<String>();
        l.add("Delhi");
        l.add("Mumbai");
        l.add("Kolkata");
        l.add("Chennai");
        l.add("Hyderabad");
        System.out.println("Original array list:\n" +l);

        ArrayList<String> l1= new ArrayList<String>();
        l1.clone();
        System.out.println("Cloned array list:\n"+l);
    }
    
}
