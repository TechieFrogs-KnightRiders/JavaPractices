import java.util.*;
 

public class HashSetSpliteratorDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(50);
        lhs.add(-30);
        lhs.add(80);
        

        
        int i = lhs.spliterator();
        System.out.println("spliterator of LinkedHashSet is:" +i);
    }
    
}
