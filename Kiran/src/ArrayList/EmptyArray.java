package ArrayList;

import java.util.ArrayList;

public class EmptyArray {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(10);
        lst.add(30);
        lst.add(60);
        lst.add("hi");
        lst.add(120);
        
        lst.removeAll(lst);
        System.out.println(lst);
        System.out.println();
        System.out.println(lst.isEmpty());

        
    }
    
    
}
