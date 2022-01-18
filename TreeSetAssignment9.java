import java.util.*; 
public class TreeSetAssignment9 {
    public static void main(String[] args) {
        
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(1);                              
        t.add(5);
        t.add(6);
        t.add(7);
        t.add(8);    
        t.add(9); 
        t.add(2); 
        t.add(3); 

        System.out.println(t);
      //  TreeSet<Integer> ths = new TreeSet<Integer>();         //new obj named ths- treeheadset
      //  ths = (TreeSet)t.headSet(7);

       /* Iterator itr;
        itr = ths.iterator();
        while(itr.hasNext())
           {
     //          System.out.println(itr.next());
           }     */
           
           
         //  System.out.println("Number greater than equal to 3 is:" +t.tailSet(3));    //QN-10


         // System.out.println("Number less than equal to 6 is:" +t.headSet(6));    //QN-11


       // System.out.println("Strictly greater than 6:" +t.higher(6));            //QN-12

        // System.out.println("Strictly lower than 6:" +t.lower(7));             //QN-13

        System.out.println("Original set is:" +t);                                  //QN14
       /* System.out.println("Retriev the first(lowest) element:"+t.pollFirst());
        System.out.println("After removing:" +t);   */


     /*   System.out.println("Retriev the last(highest) element:"+t.pollLast());       //QN-15
        System.out.println("After removing:" +t);   */

      /*  System.out.println("Remove 6 from the list:" +t.remove(6));                    //QN--16
        System.out.println("After removing 6:" +t);   */

     /*  TreeSet<Integer>comp = new TreeSet<Integer>();                         //QN-17
        comp = (TreeSet<Integer>)t.comparator();
        System.out.println("TreeSet:" +comp);   */




        
    }
}