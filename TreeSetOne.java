import java.util.*; 
public class TreeSetOne {
    public static void main(String[] args) {
        
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(10);                              
        t.add(50);
        t.add(60);
        t.add(70);
        t.add(30);    
        t.add(90);                  

        Iterator<Integer>itr = t.iterator();
        while(itr.hasNext())
           {
            System.out.println(itr.next());              //o/p in ascending order by default (duplicates not allowed)
           }
           System.out.println(t);




//Iterator descendingIterator()- It is used iterate the elements in descending order.
   Iterator i = t.descendingIterator();                 
    System.out.println("In descending order:" );
     while(i.hasNext())
        {
          System.out.println(i.next());
         }  



//descendingSet() - It returns the elements in reverse order.
     System.out.println("Reverse set:" +t.descendingSet());


//floor()- It returns the equal or closest least element of the specified element from the set, or null there is no such element.
           System.out.println("floor(52):"  +t.floor(52));


//ceiling()- It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.  
           System.out.println("ceiling(67):"  +t.ceiling(67));

    

//E higher(E e)- It returns the closest greatest element of the specified element from the set, or null there is no such element.
     System.out.println("higher(64):"  +t.higher(64));

 //E lower(E e)-It returns the closest least element of the specified element from the set, or null there is no such element.
      System.out.println("lower(35):"  +t.lower(35));

         
 

// headSet(E toElement)-It returns the group of elements that are less than the specified element(excluding the element)
          System.out.println("Headset for 60 is :" +t.headSet(60));
         System.out.println("Headset for 45 is :" +t.headSet(45));

//tailSet(E fromElement)- It returns a set of elements that are greater than or equal to the specified element.
          System.out.println("TailSet for 15 is :" +t.tailSet(15)); 




//subSet(E fromElement, E toElement))- It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
         System.out.println("SubSet:" +t.subSet(37,85));

//isEmpty()-It returns true if this set contains no elements.
       System.out.println("check if set is empty:" +t.isEmpty());


//contains(Object o)- It returns true if this set contains the specified element.
      System.out.println("check if set contains :" +t.contains(50));
       System.out.println("check if set contains :" +t.contains(75));



//Object clone() - It returns a shallow copy of this TreeSet instance.
      System.out.println("after cloning set becomes:" +t.clone());


//E first()- It returns the first (lowest) element currently in this sorted set.
      System.out.println(" the first/lowest element is:" +t.first());

//E last() - It returns the last (highest) element currently in this sorted set.
      System.out.println(" the last/highest element is:" +t.last());

//int size() - It returns the number of elements in this set.
       System.out.println(" the size of the set is:" +t.size());




//remove(Object o)-It is used to remove the specified element from this set if it is present.
System.out.println("remove the element 30: " +t.remove(30));
System.out.println("after removing 30 set becomes:" +t);


//E pollFirst() - It is used to retrieve and remove the lowest(first) element.
           System.out.println("pollFirst value:" +t.pollFirst());

//E pollLast() - It is used to retrieve and remove the highest(last) element.
            System.out.println("pollLast value:" +t.pollLast());


//void clear()-It is used to remove all of the elements from this set.
t.clear();
System.out.println("After clearing all elements:" +t);

       

    
}
}
