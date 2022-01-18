//ArrayList Qn19-To increase the size/capacity of array list 
import java.util.*;
public class ArrayList19 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Dog");
        l.add("Cat");
        l.add("Goat");
        l.add("Sheep"); 
        System.out.println("Original list:" +l); 
        l.ensureCapacity(7);                                  //l.ensureCapacity(size) - to increase the capacity to needed capacity
        l.add("Horse");
        l.add("Giraffe");
        l.add("Zebra");
        System.out.println("New array list:"+ l);
    }

    
}
