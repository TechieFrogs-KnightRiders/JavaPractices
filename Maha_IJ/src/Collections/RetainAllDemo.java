package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;


public class RetainAllDemo {
    public static void main(String[] args) {
        ArrayList<String > mylist=new ArrayList<String>();
        mylist.add("Maha");
        mylist.add("RAJA");
        mylist.add("rani");
        mylist.add("kavita");
        ArrayList<String > mylist1=new ArrayList<String>();
        System.out.println("is Arraylist mylist is empty or not  " +mylist1.isEmpty());
        mylist1.add("Maha");
        mylist1.add("aaa");
        mylist1.add("bbb");
        mylist1.add("ccc");

        System.out.println(mylist1.size());
        System.out.println("RetainAll method");
        mylist.retainAll(mylist1);
        Iterator ITR=mylist.iterator();
        while(ITR.hasNext())
        {
            System.out.println(ITR.next());
        }
    }
}
