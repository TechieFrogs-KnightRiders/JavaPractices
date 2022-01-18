package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(30);
        lst.add(60);
        lst.add("Hi");
        lst.add(120);
        lst.add(90);
        lst.add("Everyone");
        System.out.println("Array List "+lst);
        System.out.println();

        Collections.shuffle(lst);
        System.out.println("Shuffled List "+lst);
        
    }
    
}
