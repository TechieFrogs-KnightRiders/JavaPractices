package ArrayList;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(30);
        lst.add(60);
        lst.add(120);
        lst.add("HI");
        
        ArrayList<Object> lst1 =  (ArrayList<Object>)lst.clone();
       
        System.out.println(lst1);
    }
    
}
