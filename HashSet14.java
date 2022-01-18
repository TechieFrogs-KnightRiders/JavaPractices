import java.util.*; 
public class HashSet14 {
    public static void main(String[] args) {
        
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(20);
        set1.add(40);
        set1.add(60);
        set1.add(80);
        set1.add(50);
        set1.add(90);
        


        System.out.println("Set1 is: " +set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(30);
        set2.add(50);
        set2.add(70);
        set2.add(80);
        set2.add(40);
        System.out.println("Set1 is: " +set2);

        set2.addAll(set1);
        System.out.println("Union of 2 sets is: "+set2);           //QN 14

      set2.retainAll(set1);                                         //QN 15
      System.out.println("Intersection: "+set2);

      set1.removeAll(set2);                                            //QN 16
      System.out.println("Difference between 2 sets:"+set1);

      boolean result = set1.containsAll(set2);
      System.out.println(result);                                     //QN 17 - o/p is FALSE


        


    }
    
}
