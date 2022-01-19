package Collections;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> tSet=new TreeSet<>();
        tSet.add("Ohio");
        tSet.add("Chicago");
        tSet.add("SFO");
        tSet.add("Texas");
        TreeSet<Integer>  tSetint=new TreeSet<>();
        tSetint.add(10);
        tSetint.add(20);
        tSetint.add(39);
        tSetint.add(40);
        tSetint.add(50);
        System.out.println(tSet);//Tree Set will take elements in a order
        System.out.println(tSetint);
       System.out.println("ciling element "+tSet.ceiling("Charllet"));//return greater than or equal to the given element
        System.out.println("ciling element "+tSetint.ceiling(15));
        System.out.println("Floor element "+tSet.floor("SFO"));//returns less than or equal element
        System.out.println("Floor element "+tSetint.floor(40));
        System.out.println("Head Set element "+tSet.headSet("SFO"));//returns whose elements r less than to element
        System.out.println("Head Set element "+tSetint.headSet(20));
        System.out.println("Tail Set element "+tSet.tailSet("SFO"));//return including this element and greater elements will print
        System.out.println("Tail Set element "+tSetint.tailSet(39,false));//now it will not include given value
        System.out.println("Heigher Set element "+tSetint.higher (20));
        System.out.println("Lower Set element "+tSetint.lower (30));
        System.out.println("Head set elements "+tSetint.headSet(39, true));
        System.out.println("Sub set elements "+tSetint.subSet(20,40));
        System.out.println("contains method "+tSet.contains("Abc"));
        System.out.println("First Poll element of set "+tSet.pollFirst());//we can retrive and remove that particular value
        System.out.println("Last element of set  "+tSet.pollLast());
        System.out.println("descending elements  "+tSetint.descendingSet());
        System.out.println("First element   "+tSetint.first());
        System.out.println("Last element of set  "+tSetint.last());
    //  System.out.println("comparator elements in oreder  "+tSetint.comparator());
        TreeSet<Integer> tI= new TreeSet<>();
        tI.add(111);
        tI.add(999);
        tI.add(222);
        tI.add(777);
        Comparator comp=tI.comparator();
        System.out.println("comparator elements in oreder  "+comp);

        TreeSet<Integer> tInt=new TreeSet<>();
        System.out.println("Is Empty method  "+tInt.isEmpty());
        tInt=(TreeSet<Integer>) tSetint.clone();
        System.out.println("remove method "+tInt.remove(20));
        for(int i:tInt){
            System.out.println(i);
        }

        Iterator it=tSet.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       // tSet.clear();
        System.out.println("after clear"+tSet);
    }
}
