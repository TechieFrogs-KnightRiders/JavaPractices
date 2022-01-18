package ArrayList;

import java.util.ArrayList;

public class Get {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(30);
        lst.add(60);
        lst.add(120);
        lst.add("Hello");
        
        System.out.println("Array list "+lst);

        Object A = lst.get(0);
        Object B = lst.get(3);
        System.out.println(A+" "+B);


        
    }
    
}
