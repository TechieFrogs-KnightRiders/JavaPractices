package AssignmentPriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Prog1To {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("lavender");
        pq.offer("white");
        pq.offer("gold");
        pq.add("green");
        System.out.println(pq);
        Iterator<String> it=pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        PriorityQueue<String> pq1=new PriorityQueue<>();
        pq1.addAll(pq);
        pq.add("blue");
       // pq.removeAll(pq1);
        System.out.println(pq);
        System.out.println("count the nub of elements "+pq.size());
       System.out.println("compare 2 priority queues "+pq.equals(pq1));
       System.out.println("retrieve the first"+pq.peek());
        System.out.println("retrieve and remove the first"+pq.poll());
        Object arr[]=  pq.toArray();
        for(Object s:arr){
            System.out.println(s);
        }
        String str=pq.toString();
        System.out.println("Convert Priority Queue "+str);
    }
}
