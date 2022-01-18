package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reversed {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add("Hi"); 
        lst.add(30); 
        lst.add(60); 
        lst.add("Everyone"); 
        lst.add(120); 
        lst.add(90); 

        Collections.reverse(lst);
        System.out.println(lst);
        
    
    }
    
}
