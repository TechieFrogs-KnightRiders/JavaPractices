import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Spliterator;

public class DeQueueDemo {
    public static void main(String[] args) {
        //Deque<String> dq = new ArrayDeque<>();
        ArrayDeque<String> dq = new ArrayDeque<>();
       
        dq.add("Citrus");
        dq.add("Apple");
        dq.add("Banana");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sirisha");
        arrayList.add("Ramana");
        arrayList.add("Sridhar");

        dq.addAll(arrayList);

        dq.offer("Grapes");

        dq.addFirst("PineApple");
        dq.addLast("DragonFruit");
        
        dq.offerFirst("Papaya");
        dq.offerLast("Orange");

        dq.addFirst("PineApple");
        dq.addLast("DragonFruit");
        dq.addLast("DragonFruit");
        dq.push("DragonFruit");

       // dq.clear();

        System.out.println("The element - "+dq.element());

        System.out.println("The first element - "+dq.getFirst());
        System.out.println("The last element - "+dq.getLast());
        System.out.println("The first peek element - "+dq.peekFirst());
        System.out.println("The last peek element - "+dq.peekLast());

        dq.poll();

      //  dq.pollFirst();
      //  dq.pollLast();
        

      //  dq.pop();
        dq.push("Watermelon");

      //  dq.removeFirstOccurrence("DragonFruit");

       Spliterator spl =  dq.spliterator();
       spl.tryAdvance(i -> System.out.println(i));
     //  spl.tryAdvance(i -> System.out.println(i));
       System.out.println("Remaining elements");
       spl.forEachRemaining(i -> System.out.println(i + "10"));
      // spl.forEachRemaining


      /*  Iterator<String> itr = dq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

       
    }
}
