import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHSet = new LinkedHashSet<>();
        linkedHSet.add("G Hi");
        linkedHSet.add("Hello All Good");
        linkedHSet.add("Good Day");
        linkedHSet.add("Good Evening");
        linkedHSet.add("G Evening");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("30");
        arrayList.add("60");
        
        linkedHSet.addAll(arrayList);

        linkedHSet.remove("10");
        linkedHSet.removeAll(arrayList);

        linkedHSet.removeIf(s1->s1.contains("G"));

        Iterator<String> itr = linkedHSet.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
