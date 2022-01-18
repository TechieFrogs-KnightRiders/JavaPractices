package Kiran.HashSet;

import java.util.HashSet;

public class HashSetAssign1 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(40);
        

        HashSet<Integer> hSet1 = new HashSet<>();

        hSet1.add(20);
        hSet1.add(10);
        hSet1.add(50);
        hSet1.add(60);
        System.out.println("hSet Elements :"+hSet);
        System.out.println("hSet1 Elements :"+hSet1);
        System.out.println("----------");
         
        System.out.println("union of Two Sets :");
        hSet.addAll(hSet1);  
        System.out.println(hSet);
        
       System.out.println("----------");
       System.out.println("Difference B/W two Sets :");
       hSet.removeAll(hSet1);
       System.out.println(hSet);
       System.out.println("----------");
       System.out.println("Intersection of Two Sets :");
      //  hSet.retainAll(hSet1);
     //   System.out.println(hSet);

     System.out.println("----------");
     System.out.println("Checking if it is a subset or not :");
     if (hSet.containsAll(hSet1)) {
         System.out.println("Yes");
         
     } else {
         System.out.println("No");
         
     }

    




    }
    
}
