package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashset=new HashSet<>();
        hashset.add(10);
        hashset.add(20);
        hashset.add(20);
        hashset.add(30);
       System.out.println("size of hashset is " +hashset.size());
       List<Integer> list=new ArrayList<>();
       System.out.println("is Empty method \n"+list.isEmpty());
       list.add(100);
       list.add(200);
       list.add(300);
       hashset.addAll(list);

        //hashset.removeAll(list);//removes which r common elements in set and list
        //hashset.clear();//clear all elements from set
        HashSet<Object> ho=new HashSet<>();
        ho.add(111);
        ho.add("aaa");
       Object hashset2=hashset.clone();//we can clone in this way if it is obj type
        for(Object o:ho){
            System.out.println(o);
        }
        HashSet<Integer> hashset1=new HashSet<Integer>();//creating another set for clone
        hashset1=(HashSet)hashset.clone();//cloning process

        hashset.removeIf(s1->s1.equals(20));//To removeIf() for Integer. for String, set.removeIf(s->s.contains(""));
       Iterator<Integer> i=hashset1.iterator();

       while(i.hasNext()){//iterator will be before index so it check for next element
           System.out.println(i.next());//it will not print in order
       }
       //hashset.remove(10);
       hashset.removeAll(list);
       System.out.println("after removing all list elements "+hashset);

    }
}
