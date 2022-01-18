package ArrayList;

import java.util.ArrayList;

public class Repalce {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add("Hi");
        lst.add(30);
        lst.add(60);
        lst.add(120);
        lst.add(90);

        lst.set(2,"Everyone");
        System.out.println(lst);
    }
    
}
