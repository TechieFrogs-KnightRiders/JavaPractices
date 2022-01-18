//Qn4- Iterate a linked list in reverse order
import java.util.*;
import java.util.Iterator;
public class LinkedList4To26 {
    public static void main(String[] args) {
        LinkedList<String>l  = new LinkedList<String>();
        l.add("Sun");
        l.add("Moon");
        l.add("Stars");
        l.add("Sky");
        l.add("Planets");
        System.out.println("Original list: "+l);

       Iterator itr = l.descendingIterator();
        while(itr.hasNext())
          {
              System.out.println(itr.next());
          }
        }
    } 

    //Qn5- Insert the specified element at the specified position in the linked list
  /*  l.add(2,"clouds");
    System.out.println("List after inserting the element:"+l);  */



    //Q6- Insert elements into the linked list at the first and last position
  /*  l.addFirst("Galaxy");
    l.addLast("Astroid");
    System.out.println("Final list: "+l);   */
    
    //Q7- Insert the specified element at the front of a linked list
 //   l.offerFirst("Rain");


 //Q8- Insert the specified element at the end of a linked list
 //l.offerLast("Soil")



 //Q9- Insert some elements at the specified position into a linked list
  /* l2.add("Water");
     l2.add("Sunlight");
     l.addAll(1,l2);
     System.out.println("Final list: "+l);   */

     //10- Get the first and last occurance of the specified elements in a linked list
    /* Object first_element= l.getFirst();
    system.out.println(first_element);
    Object last_element= l.getLast();
    system.out.println(last_element);   */


    //11- Display the elements n their positions in a linked list
   /* for(int p=0;p<l.size();p++);         // p is the position
    {
        System.out.println("Element at index"+p+": "+l.get(p));
    } */

    //12- Remove a specified element from a linked list
   /* l.remove(3);                                        //remove the element in the fourth position
    System.out.println("Final list: "+l);    */

    //13-Remove the first and last element from a linked list
  /*  l.removeFirst();
    System.out.println(l); 
    l.removeLast();
    System.out.println(l); 
    System.out.println("Final list: "+l);  */




    //14- Remove all the elements frm a linked list
  /*  l.clear();
    System.out.println("Final list: "+l);  */



    //15- Swap 2 elements in a linked list
   // Collections.swap(l,2,4)                  //swap index2 element with index4 element



   //16- Shuffle the elements
  // Collections.shuffle(l);


  //17- Join 2 linked lists
 /* LinkedList<String> l1 = new LinkedList<String>();
  l1.add("Dog");
  l1.add("Cat");
  l1.add("Goat");
  l1.add("Sheep"); 
  System.out.println("List1:" +l1);  

  LinkedList<String> l2 = new LinkedList<String>();
  l2.add("Black");
  l2.add("White");
  l2.add("Red");
  l2.add("Green");
  System.out.println("List2:"+l2);

  LinkedList<String> a = new LinkedList<String>();
  a.addAll(l1);
  a.addAll(l2);
  System.out.println(a);  */

  //18- clone a linked list to another linked list
 /* System.out.println("Original list: "+l);
  LinkedList<String>newl= new LinkedList<String>();
  newl=(LinkedList)l.clone();
  System.out.println(newl);   */

  //19- Remove n return the first element of a linked list
 // l.removeFirst();                       //or l.pop();



 //20- Retrieve but doesnot remove,the first element os a LList
 /*System.out.println("Original list: "+l);
 String x= l.peekFirst();
 System.out.println(x);
 System.out.println(l);    */



 //21- Retrieve but doesnot remove,the last element of a LList
 /*System.out.println("Original list: "+l);
 String x= l.peekLast();
 System.out.println(x);
 System.out.println(l);    */



//22- chk if a particular element exist or not in a LList
/*System.out.println("Original list: "+l);
if(l.contains("Moon"))
{
    System.out.println("element is present in list");
}
else{
    System.out.println("element is not present in list");   
}    */


//23- Convert a linked list to array list
/*List<String>list = new ArrayList<String>(l);
for(String str :list)
{
    System.out.println(str);  
}  */





//24- Compare two linked strings
/*LinkedList<String> l1 = new LinkedList<String>();
  l1.add("Dog");
  l1.add("Cat");
  l1.add("Goat");
  l1.add("Sheep"); 
  System.out.println("List1:" +l1);  

  LinkedList<String> l2 = new LinkedList<String>();
  l2.add("Black");
  l2.add("White");
  l2.add("Red");
  l2.add("Green");
  System.out.println("List2:"+l2);

  LinkedList<String>l3=new LinkedList<String>();
  for(String e : l1)
  l3.add(l2.contains(e) ?  "Yes"   :  "No");
  System.out.println(l3);   
}
}      */




//25- Test a linked list is empty or not
/*System.out.println("original list:" +l");
l.isEmpty();
System.out.println("check if list is empty or not:"+l.isEmpty());
l.removeAll(l);
System.out.println("After removing all elements" + l);
l.isEmpty();
System.out.println("check if list is empty or not:"+l.isEmpty());  */




//26- Replace an element in a linked list
/*System.out.println("original list:" +l");
l.set(2,"Air");                                 //Replace the 2nd index ie 3rd element to Air.
System.out.println("After replacing the 3rd element  list is :" +l");
}
}   */




  









  



    

    


     




    

