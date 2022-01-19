package Collections;

import java.util.*;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(15);
        vector.add(5);
        vector.addElement(20);
        System.out.println("size of vector "+vector.size());
        System.out.println("capacity of vector "+vector.capacity());
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(6);
        arr.add(9);
        arr.add(12);
        arr.add(15);
        arr.add(18);
        vector.add(25);
        vector.addAll(arr);
        vector.setElementAt(12,1);
        Iterator<Integer> it= vector.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("capacity of vector is Doubled because increased size "+vector.capacity());
        vector.trimToSize();
        System.out.println("trim the size of vector "+vector.size()+"  "+vector.capacity());
        Vector<Integer> vec=new Vector<>();
        vec=(Vector<Integer>)vector.clone();
        for (int i:vec) {
            System.out.println(i);
        }
        System.out.println("contains method "+vec.contains(18)+" "+vec.containsAll(vector));
        Integer[] array=new Integer[(vector.size())];
        vector.copyInto(array);
        System.out.println("Array elements");
        for(int in:array){
            System.out.println(in);
        }
System.out.println("elementAt  method "+vector.elementAt(0));
        //elements method is Enumeration obj it generate all items of vector just like iterator
        Enumeration<Integer> en=vector.elements();
        System.out.println("data in en is ");
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
System.out.println("comparing method equal() "+vector.equals(vec));
        System.out.println("First element "+vector.firstElement());
        System.out.println("get index element "+vector.get(2));
        System.out.println("HashCode vector = "+vec.hashCode());
        System.out.println("Index of  vector = "+vec.indexOf(15));
        vec.insertElementAt(21,11);
        System.out.println("insert element at  "+vec);
        System.out.println("is Empty method "+vec.isEmpty());
        System.out.println("Last element of  vector "+vec.lastElement());
        System.out.println("Last element of  vector "+vec.lastIndexOf(21));
        System.out.println("Last element index of  vector "+vec.lastIndexOf(25,5));
        ListIterator<Integer> liit=vector.listIterator();
        System.out.println("to Iterate by using listiterato");
        while(liit.hasNext()){
            System.out.println(liit.next());
        }
        vec.removeAllElements();
        System.out.println("after remove all elements from vec "+vec);
        System.out.println("remove element at vector "+vector.removeElement(3));
    System.out.println("remove if condition ");
    vector.removeIf(n->(n%3==0));
    for(int i:vector){
        System.out.println(i);
    }
    //we can removeRange method is not directly supported its protected
        //vector.removeRange(1,3);
    System.out.println("remove range is include starting excludes end "+vector);
    Collections.replaceAll(vector,10,200);
    System.out.println("after raplacing "+vector);
        System.out.println("retail all method "+arr);
        vector.add(3);
        arr.retainAll(vector);
    System.out.println("retail all method "+arr);
    vector.set(2,150);
        System.out.println("replace or set the specified index element "+vector);
        vector.setElementAt(50,1);
        System.out.println("replace or setElementAt the specified index element "+vector);
        vector.setSize(10);
        System.out.println("set size of vector "+vector.size());

        List<Integer> li=vector.subList(1,3);
        System.out.println("my list elements");
        for (int i:li) {
            System.out.println(i);
        }
        System.out.println("my Vector elements"+vector);
        Spliterator<Integer> spl=vector.spliterator();
        spl.tryAdvance(System.out::println);//print first element
        spl.forEachRemaining(System.out::println);//print remaining elements

    }
}
