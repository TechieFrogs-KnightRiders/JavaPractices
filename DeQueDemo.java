import java.util.*; 
public class DeQueDemo {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add ("Red");
        dq.add("Blue");
        dq.add("Green");
        dq.add("Orange");
        dq.add("Yellow");

        for(String str:dq)
          {
       //       System.out.println(str);
          }

          System.out.println("original deque is:" +dq);
          System.out.println("Add white as first element:" +dq.offerFirst("White"));
          System.out.println("Add Brown as last element:" +dq.offerLast("Brown"));
          System.out.println(dq.pollFirst());
           System.out.println(dq.pollLast());
          

          System.out.println(dq.isEmpty());
          System.out.println(dq.pop());
            
          
          System.out.println(dq);

          Iterator<String>itr = dq.iterator();
          while(itr.hasNext());
            {
                System.out.println(itr.next());
            }  

            
            
            
            Spliterator<String> splitr = dq.spliterator();    
            //Print EstimateSize   
            System.out.println("Estimate size of ArrayList: " + splitr.estimateSize()); 

            
            
            


           

           
    }
    
}
