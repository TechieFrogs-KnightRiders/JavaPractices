import java.util.*; 
public class TreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet<String> t = new TreeSet<String>();
        t.add("Columbus");                              //Columbus- C uppercase-ASCII code- 67
        t.add("Newyork");
        t.add("Texas");
        t.add("Dallas");
        t.add("california");                          // california - c lowercase- ASCII code -99

        Iterator<String>itr = t.iterator();
        while(itr.hasNext())
           {
            System.out.println(itr.next());              //o/p in ascending order by default
           }




        Iterator i = t.descendingIterator();                 //in descending order
        System.out.println("In descending order:" );
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        


        System.out.println("Does it contain:" +t.contains("Texas"));

        

        System.out.println("Initial set:" +t);

        System.out.println("Reverse set:" +t.descendingSet());

       System.out.println("Head set:" +t.headSet("Newyork",true));   //o/p contains- all elments till Newyork
        
       System.out.println("SubSet:" +t.subSet("Columbus","Texas"));   // return o/p from element and excludes to element

        System.out.println("TailSet:" +t.tailSet("Dallas"));    //greater than or equal to specified element

        System.out.println("Highest value:" +t.pollFirst());      //remove the highest value ie top element columbus

       System.out.println("Lowest value:" +t.pollLast());          // remove the lowest element,Texas

        System.out.println(t);

    }
    
}
