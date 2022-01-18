package ArrayList;

import java.util.ArrayList;

public class TrimArrayList {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(30);
        lst.add("HI");
        lst.add(90);
        lst.add(120);
        lst.add("Everyone");

        lst.trimToSize();
        System.out.println(lst);
    }
    
}
