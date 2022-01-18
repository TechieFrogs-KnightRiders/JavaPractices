package Kiran.TreeSet;

import java.util.TreeSet;

public class TreeSetAssign3 {
    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>();

        tSet.add(10);
        tSet.add(20);
        tSet.add(30);
        tSet.add(40);
        tSet.add(50);
        tSet.add(60);
        tSet.add(70);
        tSet.add(80);
        tSet.add(90);
        tSet.add(100);

        TreeSet<Integer> tSet2 =(TreeSet) tSet.headSet(70);
        System.out.println(tSet2);
         System.out.println("----------");
         System.out.println("Greater than equal to given element ");
        System.out.println(tSet.ceiling(51));

        System.out.println("----------");
        System.out.println("Less than equal to given element ");
        System.out.println(tSet.floor(86));

        System.out.println("----------");
        System.out.println("Strictly Greater than equal to given element ");
        System.out.println(tSet.higher(99));

        System.out.println("----------");
        System.out.println("Strictly Less than equal to given element ");
        System.out.println(tSet.lower(69));

    }
    
}
