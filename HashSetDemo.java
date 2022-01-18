import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Ravi");
        h.add("Maha");
        h.add("Manju");
        h.add("Akhil");
        h.add("100");
        h.add("200");
        h.add("null");
        h.add("Akhil");
        h.add("Maha");

        System.out.println("Original set after append  is:" +h);             //Q1

        Iterator<String> itr = h.iterator();                   //Q2
        while(itr.hasNext())
          {
              System.out.println(itr.next());  // o/p is not in order because in Set,insertion order is not preserved
          }

          h.size();
          System.out.println("Size of the hashSet is:" +h.size());          //   Q3--6 (no duplicates allowed)

         // h.removeAll(h);             //Q4   Remove all the elements from (declared set h1)Hashset h1
         // System.out.println("After removing hashset h1 elements:" +h);

          // System.out.println(" Is the set empty:" +h.isEmpty());                  //Q5-         false


         //  h.clone();                         //Q6--makes a shallow copy of hashset instance
          // System.out.println(" new hash set after coning is:"+h);


           System.out.println("Original set  is:" +h);   //Q7- converting hash set to array set
           String[] newh=new String[h.size()];
           h.toArray(newh);
           for(String element:newh)
            {
                System.out.println(element);
            }


            System.out.println("Original set  is:" +h);    //Q8 --Converting hashset to Tree set
            TreeSet<String> treeh=new TreeSet<String>(h);
            for(String element:treeh)
                {
                   System.out.println( element);
                }

         System.out.println("Original set  is:" +h);      //Q9 -convert hash set to Array list
         List<String>list=new ArrayList<String>(h);
         System.out.println("Array list contains: " +list);


         HashSet<String> h1 = new HashSet<String>();       //Q10 - compare 2 hash set
         h1.add("English");
         h1.add("Hindi");
         h1.add("Math");
         h1.add("Science");
         h1.add("Telugu");
         h1.add("Manju");
         h1.add("Akhil");

         HashSet<String> h2 = new HashSet<String>();
         for(String element:h)
           {
               System.out.println(h1.contains(element)? "Yes" : "No");
           }


           h.retainAll(h1);                   //Q11 - compare 2 sets and retain elements which are same on both sets
           System.out.println(h);

          // h.clear();                       //Q12- remove all elements
           //System.out.println(h);

           






        






        





           


          /*System.out.println(h.contains("Maha"));           //true




          HashSet<String> h1 = new HashSet<String>();
          h1.add("Nag");
          h1.add("Sridhar");
          h1.add("300");
          h1.add("Siri");

          h.addAll(h1);
          System.out.println("New list:" +h);*/

         

         


         


         //  h.clear();
         // System.out.println("After clearing all elements:" +h);


    }
}
