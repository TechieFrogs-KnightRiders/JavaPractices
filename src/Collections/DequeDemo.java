package Collections;
import java.util.*;
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> d=new ArrayDeque<>();
        d.add("aa");
        d.offer("bbb");
        d.add("aa");
        d.offer("ccc");
        System.out.println(d);
        System.out.println("pollFirst and poll both r same "+d.pollFirst());
        for(String s:d){
            System.out.println(s);
        }
        System.out.println("pollLast retrive and remove "+d.pollLast()+ " "+d);
d.add("ddd");
d.add("dog");
d.add("eee");
d.offerFirst("apple");
        System.out.println(" element method retrive the first element "+d.element()+" "+d);
        System.out.println("getFirst retrive  "+d.getFirst()+ " "+d);
        System.out.println("getLast retrive  "+d.getLast()+ " "+d);
        System.out.println("peekFirst retirves but no remove "+d.peekFirst()+ " "+d);
        System.out.println("peekLast retrives but not remove"+d.peekLast()+ " "+d);
        d.pop();
        System.out.println(" pop method remove first element "+d);
        d.push("ggg");
        System.out.println(" push method is used to add at the head of deque "+d);
        Spliterator<String> split=d.spliterator();
        System.out.println("Spliterator exact size "+split.getExactSizeIfKnown());
        System.out.println(" it will print first element ");
            split.tryAdvance(System.out::println);//it will print first element
        System.out.println("it will print the remaining element");
        split.forEachRemaining(System.out::println);
        System.out.println("Spliterator exact size "+split.getExactSizeIfKnown());


    }
}
