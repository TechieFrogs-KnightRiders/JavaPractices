package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLtr {
    public static void main(String[] args) {
        
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(10);
        lst.add(20);
        lst.add("hi");
        lst.add("Everyone");

        Iterator<Object> itr = lst.iterator();
        while(itr.hasNext()){
           System.out.println(itr.next());

        }
           

        
          
        
    }

    
}
