import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.Spliterators;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Object> hSet = new LinkedHashSet<>();
        hSet.add("hi");
        hSet.add(10);
        hSet.add(30);
        hSet.add(40);

        System.out.println(hSet);
       /* Iterator<Object> itr = hSet.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }*/
       Spliterator<Object> O = hSet.spliterator();
       O.forEachRemaining(System.out::println);
       
       
    }
    
}
