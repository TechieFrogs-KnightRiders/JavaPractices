package Kiran.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetAssign {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();

        hSet.add("Car");
        hSet.add("Bike");
        hSet.add("Boat");
        hSet.add("Plane");
       System.out.println(hSet);
       

       System.out.println("Size "+hSet.size()); // Getting the size of HashSet
      // hSet.removeAll(hSet); // Removing all Elemnets in HashSet
      // System.out.println(hSet);
         
      // System.out.println(hSet.isEmpty()); //Checking if the set is empty or not 
        System.out.println("-------------------");
        System.out.println("Iterator Elements :");
      Iterator<String> a =hSet.iterator(); //Iterating HashSet 
        while(a.hasNext()){
          
            System.out.println(a.next());
        }
        System.out.println("-------------------");
        HashSet<String> hSet1 = new HashSet<String>(); // Cloning HashSet 

        hSet1 = (HashSet)hSet.clone();
        System.out.println("Clone Elements  "+hSet1);
        
        System.out.println("-------------------"); 
         
        System.out.println("Array Elements :");
        String[] hArray = new String[hSet.size()]; //Converting Hashset to Array
        hSet.toArray(hArray);
        for(String str : hArray){
          System.out.println(str);
        }
        System.out.println("-------------------");
         
        System.out.println("TreeSet Elements :");
        TreeSet<String> tSet = new TreeSet<>(hSet);
        for(String str1 : tSet){
          System.out.println(str1);
        }
        System.out.println("-------------------");
        System.out.println("Array List :");
        ArrayList<String> hArrayList = new ArrayList<>(hSet);
        System.out.println(hArrayList);
        System.out.println("-------------------");
        
        System.out.println("Comparing two HashSets :");
        HashSet<String> hSet2 = new HashSet<>();

        hSet2.add("Car");
        hSet2.add("Plane");
        hSet2.add("Mic");
        hSet2.add("Key");

       
        for(String x : hSet){
          System.out.println(hSet2.contains(x) ? "Yes" : "No");

        }
        System.out.println("-------------------");
        System.out.println("Compare Two Sets Retain All elements :");
        hSet.retainAll(hSet2);
        System.out.println(hSet);

        System.out.println("-------------------");
        System.out.println("Removing all Elements :");
        hSet.clear();
        System.out.println(hSet);

        System.out.println("-------------------");
        System.out.println("Array to Hset :");
        
        String[] b = {"Car","Bike","Plane","Motor"};
        HashSet<String> hSet4 = new HashSet<>(Arrays.asList(b));
        System.out.println(hSet4);
        System.out.println("-------------------");

        
      


        





        
        


       
    
}
}
