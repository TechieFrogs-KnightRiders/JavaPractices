import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Coversions {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5}; 

        LinkedList<Integer> lst = new LinkedList<Integer>();

        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
         //Converting from Linked List to Array

        ArrayList<Integer> lst1 = new ArrayList<Integer>(lst);

        System.out.println("Linked List "+ lst1);
        
         

        Integer[] array = lst.toArray(new Integer[lst.size()]);
        System.out.println("Array elements");

        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
              //Converting from Array to Linked List
        List<Integer> lst2 = Arrays.asList(arr);
          System.out.println(lst2); 

       

       
        




         
        
    }
    
}
