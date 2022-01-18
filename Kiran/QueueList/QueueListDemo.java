package Kiran.QueueList;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueListDemo {
    public static void main(String[] args) {
        PriorityQueue<String> qList = new PriorityQueue<>();

        qList.add("Red");
        qList.add("Green");
        qList.add("Blue");
        qList.add("Yellow");
        qList.add("White");
        System.out.println(qList);
        System.out.println("----------");

       System.out.println("Iterator Elements :");
        Iterator<String> itr = qList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------");
        
        System.out.println("Adding elements from 1st list to 2nd list :");
        PriorityQueue<String> qList1 = new PriorityQueue<>();
        
        qList1.add("Purple");
        qList1.add("Orange");
        qList1.add("Voilet");
        qList1.add("Black");
        qList1.add("White");

        qList.addAll(qList1);
        System.out.println(qList);

        System.out.println("---------");
        System.out.println("Adding element :");
        qList.offer("Brown");
        System.out.println(qList);
        System.out.println("----------");
        System.out.println("Size of the List : "+qList.size());
        System.out.println("----------");
        System.out.println("Comparing Two Lists :");
        for(String str : qList ){
            System.out.println(qList1.contains(str) ? "Yes" : "No");
        }
        System.out.println("----------");
        System.out.println("First Element in the List is : "+qList.peek());

        
    }
    
}
