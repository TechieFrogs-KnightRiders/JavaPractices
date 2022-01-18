package ArrayList;

import java.util.ArrayList;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<Object> lst1 = new ArrayList<Object>();

        lst1.add(30);
        lst1.add("HI");
        lst1.add(120);
        lst1.add(90);

        ArrayList<Object> lst2 = new ArrayList<Object>();

        lst2.add(60);
        lst2.add("HI");
        lst2.add(120);
        lst2.add(220);

        ArrayList<Object> lst3 = new ArrayList<Object>();

        for(Object x : lst1){
            lst3.add(lst2.contains(x) ? "Yes" : "NO");
            System.out.println(lst3);
        }
    }
    
}
