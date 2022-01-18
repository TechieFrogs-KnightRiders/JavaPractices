import java.util.*;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Aamir");
        lhs.add("Shahrukh");
        lhs.add("Salman");
        lhs.add("Akhil");
        lhs.add("Nagarjuna");
        lhs.add("Chaitu");
        lhs.add("null");
        lhs.add("Akhil");
        lhs.add("Nagarjuna");

        Iterator<String> itr = lhs.iterator();
        while(itr.hasNext())
          {
              System.out.println(itr.next());    //o/p -all the elements iterate in insertion order
          }

          lhs.size();
          System.out.println("Size of the hashSet is:" +lhs.size()); 


          System.out.println(lhs.isEmpty());                  //false
          System.out.println(lhs.contains("Chaitu"));           //true


          lhs.clone();                     //makes a shallow copy of hashset instance
          System.out.println(lhs);

          lhs.remove("Salman");
          System.out.println(lhs);

          lhs.removeIf(str->str.contains("Shahrukh"));     //remove d particular element if it contains that element
          System.out.println("after removing Shahrukh :" +lhs);

           
           

           Spliterator<String>lhsSpliterator=lhs.spliterator();
          lhsSpliterator.forEachRemaining(System.out::println);
          
          



        }
    }