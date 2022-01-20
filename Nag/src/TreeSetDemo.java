import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Abc");
        ts.add("Hi");
        ts.add("Hello");
        ts.add("Good Evening");
        ts.add("Thank you");
        ts.add("Welcome");

        System.out.println("ceil value= "+ts.ceiling("Good"));
        System.out.println("floor value= "+ts.floor("hi"));

        System.out.println(ts);

        System.out.println(ts.descendingSet());
        System.out.println("headset "+ts.headSet("Good"));
        System.out.println("headset "+ts.headSet("Good Evening", true));
        
        System.out.println("tail set "+ts.tailSet("Hi"));
        System.out.println("tail set with boolean "+ts.tailSet("Hi", false));
        System.out.println("Subset "+ts.subSet("Abc", "Hi"));
        System.out.println("Subset "+ts.subSet("Abc", true, "Hi", true));

        System.out.println("Last "+ts.last());
        System.out.println("First "+ts.first());

        System.out.println("Size of set "+ts.size());
        
        boolean b = ts.contains("hh");
        System.out.println("contains ="+b);

        System.out.println("higher "+ts.higher("Hi"));
        System.out.println("Lower "+ts.lower("Good"));

        Iterator itr = ts.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}