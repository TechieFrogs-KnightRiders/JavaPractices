import java.util.*; 
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue <String>q = new PriorityQueue<>();
         q.offer("English");                                  //offer in queue is same as add in list and set
         q.offer("Hindi");
         q.offer("Math");
         q.offer("Science");
         q.offer("Science");                           //duplicates allowed
         q.offer("Telugu");
         q.offer("Biology");
         q.offer("Anthropology");
         
         System.out.println("Priority queue is:" +q);           //o/p- not sorted order

         System.out.println("head of queue is:" +q.peek());       //return head element ie alphabetic order(not remove),if empty-null 

         System.out.println(q.element());                      //return head element (not remove),if empty-RE:NoSuchElementException

         System.out.println("remove the head:" +q.poll());                //remove and return the head element ie alphabetic order,if empty-null 
         System.out.println("Now the Priority queue becomes:" +q);


         System.out.println("remove the head:" +q.remove());            //remove and return the head element,if empty- RE:NoSuchElementException
         System.out.println("Now the Priority queue becomes:" +q);
         


    }
    
}
