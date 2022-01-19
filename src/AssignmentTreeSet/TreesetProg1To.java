package AssignmentTreeSet;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetProg1To {
    public static void main(String[] args) {
        TreeSet<String> tColours=new TreeSet<>();
        tColours.add("pink");
        tColours.add("orange");
        tColours.add("Yellow");
        for(String c:tColours){
            System.out.println(c);
        }
        //Prog 2 iterating
        Iterator itColo=tColours.iterator();
        while (itColo.hasNext()){
            System.out.println(itColo.next());
        }
        //Prog 3 add all elements from one set to another set
        TreeSet<String> tColour1=new TreeSet<>();
        tColour1.addAll(tColours);
        for (String c1:tColour1){
        System.out.println(c1);
        }
        //Prog 4 reverse order. A Treeset will take elements in a order so reverse is descending
        System.out.println("Reverse order of set"+tColour1.descendingSet());
        //Prog 5 first and last elements of Tree
        System.out.println("first element of Tree "+tColours.first());
        System.out.println("last element of Tree "+tColours.last());
        //Prog 6 clone a tree set to another treeset
        TreeSet<String> tSetC= new TreeSet<>();
        tSetC= (TreeSet<String>) tColours.clone();
        for(String st:tSetC){
            System.out.println(st);
        }
        //Prog 7 nub of elements
        System.out.println("number of elements"+tSetC.size());
        //Prog 8 compare 2 treesets
        TreeSet<String> Season=new TreeSet<>();
        Season.add("rainy");
        Season.add("Winter");
        Season.add("Spring");
        Season.add("Summer");
        System.out.println("Compare 2 sets "+Season.equals(tColours));
    }
}
