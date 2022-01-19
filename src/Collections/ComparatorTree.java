package Collections;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Comparator;
import java.util.TreeSet;

class Compar implements Comparator<String>{
public int compare(String str,String str1){
    String first_str;
    String second_str;
    first_str=str;
    second_str=str1;
    return second_str.compareTo(first_str);//using compareTo() to ensure
}
}
public class ComparatorTree {
    public static void main(String[] args) {
        TreeSet<String> tS=new TreeSet<>();
        tS.add("S");
        tS.add("A");
        tS.add("N");
        tS.add("k");
        tS.add("R");
        tS.add("T");
        tS.add("I");

        System.out.println("set Before comparator "+tS);
        TreeSet<String> tS1=new TreeSet<String>(new Compar());

        tS1.add("S");
        tS1.add("A");
        tS1.add("N");
        tS1.add("k");
        tS1.add("R");
        tS1.add("T");
        tS1.add("I");
        System.out.println("after comparator"+tS1);
    }
}
