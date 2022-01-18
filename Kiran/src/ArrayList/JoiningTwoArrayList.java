package ArrayList;

import java.util.ArrayList;

public class JoiningTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Object> lst1 = new ArrayList<Object>();
        
        lst1.add("HI");
        lst1.add(30);
        lst1.add(60);
        lst1.add(120);

        ArrayList<Object> lst2 = new ArrayList<Object>();

        lst2.add("All");
        lst2.add(220);
        lst2.add(25);
        lst2.add(90);

        ArrayList<Object> lst3 = new ArrayList<Object>();

        lst3.addAll(lst1);
        lst3.addAll(lst2);
        System.out.println(lst3);

        

        
    }
    
}
