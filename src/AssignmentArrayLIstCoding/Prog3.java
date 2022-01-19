package AssignmentArrayLIstCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Prog3 {
    public static void main(String[] args) {
        ArrayList<String> AStr=new ArrayList<String>();
        AStr.add("kkk");
        AStr.add("ppp");
        AStr.add("uuu");
        AStr.add("ooo");
        AStr.add("bbb");

        Collections.reverse(AStr);
        Iterator itr=AStr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Reverse order nothing but descending order");
        if(AStr.isEmpty()==false) {
            Collections.sort(AStr, Collections.reverseOrder());
            for (String st : AStr) {
                System.out.println(st);
            }
        }
        else{
            System.out.println("Empty");
        }

    }
}
