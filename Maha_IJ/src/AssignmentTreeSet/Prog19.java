package AssignmentTreeSet;
import java.util.*;
public class Prog19 {
    public static void main(String[] args) {
        TreeSet<String > ts=new TreeSet<>();
        ts.add("cat");
        ts.add("apple");
        ts.add("drive");
        ts.add("car");
        ts.add("ball");
        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<String> ts2 = new TreeSet<>();
        TreeSet<String> ts3 = new TreeSet<>();
        Iterator<String> it = ts.iterator();
        while(it.hasNext()) {
            String str = it.next().toString();
            char cc = str.charAt(0);
            if (cc < 'a') {
                ts1.add(str);
            }
            if (cc >= 'b') {
                ts2.add(str);
            }
            if (cc >= 'c' && cc < 'd') {
                ts3.add(str);
            }
        }
        System.out.println("less than a value "+ts1);
        System.out.println("Greater than equal to 'b' value "+ts2);
        System.out.println("Greater than or equal c and less than 'd' value "+ts3);
    }
}
