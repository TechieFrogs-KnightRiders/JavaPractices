package Collections;

import java.util.*;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHset= new LinkedHashSet<>();
        linkedHset.add("sun");
        linkedHset.add("moon");
        linkedHset.add("starts");
        linkedHset.add("planet");
        List<String> Alist=new ArrayList<>();
        linkedHset.addAll(Alist);
        LinkedHashSet<String > linkedHset1=new LinkedHashSet<>();
       linkedHset1= (LinkedHashSet)linkedHset.clone();
       linkedHset1.removeIf(s1->s1.contains("moon"));//for string type we use this method "contains()"
       LinkedHashSet<Integer> linkedIntHSet=new LinkedHashSet<>();
       linkedIntHSet.add(10);
       linkedIntHSet.add(20);
       linkedIntHSet.add(30);
       linkedIntHSet.add(40);
      Spliterator<Integer> sp=linkedIntHSet.spliterator();
      System.out.println("Spliterator of linkedIntHashset  " +sp.getExactSizeIfKnown());
       sp.tryAdvance(System.out::println);//it will print the first nub of set
        System.out.println("remaining elements");
        sp.forEachRemaining(System.out::println);//to print remaining elements
       System.out.println(sp.tryAdvance(System.out::println));

        Spliterator linkedHsetSplit= linkedHset.spliterator();
       linkedHsetSplit.forEachRemaining(System.out::println);
    List<String> li=Arrays.asList("ab","ac","ad");

    Spliterator<String> s=li.spliterator();
      /* Iterator itr=linkedHset1.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
*/
    }

}