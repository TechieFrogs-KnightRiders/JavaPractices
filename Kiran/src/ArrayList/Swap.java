package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();
        
        lst.add(30);
        lst.add(60);
        lst.add(120);
        lst.add("Hello");
        lst.add("Everyone");
        System.out.println(lst);
        System.out.println();

        Collections.swap(lst, 0, 3);
        System.out.println(lst);
        
    }
    
}
