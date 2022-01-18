import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet <Object> lst = new HashSet <>();  
        lst.add(10);  
        lst.add(30);  
        lst.add(40);
        lst.add("Hi"); 
       // lst.remove(40);
        Spliterator<Object> x = lst.spliterator();    
        x.forEachRemaining(System.out::println);   
        System.out.println("spliterator of HashSet is: "+x.getExactSizeIfKnown());           
    }  

        
    }
    

