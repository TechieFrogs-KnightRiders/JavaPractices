// Iterate through ArrayList using ListIterator
import java.util.*; 
public class ArrayList2 {
    public static void main(String[] args) {
      ArrayList<String> subject = new ArrayList<String>();
      subject.add("English");
      subject.add("Hindi");
      subject.add("Math");
      subject.add("Science");
      subject.add("Telugu");
      System.out.println("ArrayList:" +subject);

      Iterator itr=subject.iterator();
      System.out.println("Iterating through ArrayList:");
      while(itr.hasNext()){                                    //returns true if there is next element in arraylist
          System.out.print(itr.next() +", ");                   // returns the next element of arraylist
      }

    }
    
}
