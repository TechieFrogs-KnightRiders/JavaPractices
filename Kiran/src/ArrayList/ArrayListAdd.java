package Kiran.src.ArrayList;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();
        
        lst.add(30);
        lst.add(60);
        lst.add("Hello");
        lst.add(120);
        lst.add("sup?");
       

        System.out.println("Array List "+lst);

        lst.add(0,"Everyone");
        System.out.println();
        System.out.println(lst);
    }
    
}
