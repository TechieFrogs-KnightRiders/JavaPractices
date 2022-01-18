package ArrayList;

import java.util.ArrayList;

public class IncreaseSize {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>(3);
        
        lst.add(30);
        lst.add(120);
        lst.add(220);
        System.out.println("Array List "+lst);
        System.out.println();

        lst.ensureCapacity(5);
        lst.add("HI");
        lst.add("Everyone");

        System.out.println(lst);
    }
    
}
