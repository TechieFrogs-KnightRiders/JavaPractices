import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.add("Nag");
        pQueue.add("Akhil");
        pQueue.add("Maha");
        pQueue.add("Manju");
        pQueue.add("Hello");
        pQueue.add("Hello");
        pQueue.add("");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sirisha");
        arrayList.add("Ramana");
        arrayList.add("Sridhar");


        pQueue.addAll(arrayList);

        pQueue.offer("Hello");

       pQueue.removeAll(arrayList);

        Iterator<String> itr = pQueue.iterator();
        System.out.println("Printing all the elements:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 

      //  pQueue.clear();

        System.out.println("Poll element - "+pQueue.poll());
        if(pQueue.size()>0)
        System.out.println("Remove element - "+pQueue.remove());

        System.out.println("Peek element - "+pQueue.peek());
        if(pQueue.size()>0)
        System.out.println("Get element - "+pQueue.element()); 
    }
}
