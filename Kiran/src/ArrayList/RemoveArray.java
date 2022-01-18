package ArrayList;

import java.util.ArrayList;

public class RemoveArray {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(25);
        lst.add(30);
        lst.add("Hi");
        lst.add(90);
        lst.add(120);

        System.out.println("Array list "+lst);
        System.out.println();
        lst.remove(2);
        System.out.println(lst);
        
    }
    
}
