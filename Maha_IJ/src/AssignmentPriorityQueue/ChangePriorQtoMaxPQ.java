package AssignmentPriorityQueue;

import java.util.PriorityQueue;
import  java.util.*;
public class ChangePriorQtoMaxPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQI = new PriorityQueue<>(5, Collections.reverseOrder());
        pQI.add(76);
        pQI.add(12);
        pQI.add(50);
        pQI.add(30);
        pQI.offer(25);
        System.out.println("Priority Queue will print in order" + pQI);
        Integer val = null;
        while ((val = pQI.poll()) != null) {
            System.out.println(val + " ");
        }
        System.out.println("\n");

    }
}
