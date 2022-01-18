import java.util.*; 
public class TreeSetAssignment1 {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<String>();
        ts1.add("a");
        ts1.add("b");
        ts1.add("c");
        ts1.add("d");
       // ts1.add("Orange");
        System.out.println("TreeSet is : " +ts1);

       /* Iterator<String>itr = ts1.iterator();            //QN2 - using iterator,while
        while(itr.hasNext())
           {
            System.out.println(itr.next());              //o/p in ascending order by default
           }  */

          /* for(String element:ts1)                          // //QN2 - using for
             {
                 System.out.println(element);
             }   */  



           /*  TreeSet<String> ts2 = new TreeSet<String>();    //QN3
             ts2.add("Black");
             ts2.add("White");
             ts2.add("Purple");
             ts2.add("Teal");
            System.out.println("TreeSet is : " +ts2); */

           // ts1.addAll(ts2);
          //  System.out.println(ts1);

          //  System.out.println("origional treeset is:" +ts1);    //QN4
         /*   Iterator itr = ts1.descendingIterator();
            while(itr.hasNext())
              {
          //        System.out.println(itr.next());
              }   */

         // System.out.println("first element is:" +ts1.first());      //QN5
        //  System.out.println("last element is:" +ts1.last());

     //   System.out.println("after cloning:" +ts1.clone());          //QN6

     //   System.out.println("Treeset size is:" +ts1.size());           //QN7

    /* TreeSet<String> result = new TreeSet<String>();                   //QN8
     for(String element: ts1)
       {
           System.out.println(ts2.contains(element)? "Yes"   : "No");

       }*/



       System.out.println("Strictly greater than a:" +ts1.higher("a"));    //QN --19
       System.out.println("Strictly lower than a:" +ts1.lower("a"));
       System.out.println(" greater than equal to b is:" +ts1.tailSet("b"));
     
       System.out.println(" greater than equal to c and less than d is:" +ts1.subSet("c" ,"d"));
       

    }
    
}
