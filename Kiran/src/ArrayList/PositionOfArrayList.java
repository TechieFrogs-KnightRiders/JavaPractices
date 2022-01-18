
package ArrayList;

import java.util.ArrayList;

public class PositionOfArrayList {
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(30);
        lst.add("HI");
        lst.add(120);
        lst.add(60);

        int x = lst.size();
        for(int y = 0; y < x; y++){
            System.out.println(lst.get(y));
        }
    }
    
}
