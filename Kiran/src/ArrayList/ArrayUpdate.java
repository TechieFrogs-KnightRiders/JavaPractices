package ArrayList;

import java.util.ArrayList;

public class ArrayUpdate {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add("Hi");
        lst.add("Everyone");
        lst.add(30);
        lst.add(60);
        lst.add(120);

        System.out.println("Array List "+lst);
        System.out.println();
        lst.set(2,"Hello");
        System.out.println(lst);

        

        
        
    }
}
