package Collections;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String > pQ=new PriorityQueue<>();// prioriting the headone
        pQ.add("name");
        pQ.add("id");
        pQ.add("location");
        pQ.add("ssn");
        pQ.offer("gender");
        System.out.println(pQ);
        ArrayList<String> aL=new ArrayList<>();
        aL.add("emp");
        aL.add("student");
        pQ.addAll(aL);
        System.out.println(pQ);
        System.out.println("to retrieve first element "+pQ.element());
        if(pQ.size()>0)
            //peek() will throw  no such element exception
        System.out.println("to retrive first element using peek "+pQ.peek());
        System.out.println("to retrieve nd remove first element "+pQ.remove());
        System.out.println("to retrieve nd remove first element "+pQ.poll());
        System.out.println(pQ);
        PriorityQueue<Integer> pQI=new PriorityQueue<>();
        pQI.offer(30);
        pQI.offer(45);
        pQI.add(20);
        pQI.add(10);
        pQI.add(5);

        System.out.println(pQI);
    }
}
