package ArrayList;

import java.util.ArrayList;

public class Portion {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(25);
        lst.add(30);
        lst.add(60);
        lst.add(120);
        lst.add("HI");
        lst.add(220);
        lst.add("Everyone");

        
        System.out.println(lst.subList(0, 3));
    }
    
}
