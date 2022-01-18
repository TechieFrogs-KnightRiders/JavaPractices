//ArrayList22- To print all the elements of array list using the position of the elements 
import java.util.*;
public class ArrayList22 {
    public static void main(String[] args) {
        ArrayList<String> l= new ArrayList<String>();
        l.add("Delhi");
        l.add("Mumbai");
        l.add("Kolkata");
        l.add("Chennai");
        l.add("Hyderabad");
        System.out.println("Original array list:\n" +l);

        int num = l.size();
        for(int index=0; index<num; index++)
        System.out.println(l.get(index));

        
    }
    
}
