package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class MethodsInArrList {
    public static void main(String[] args) {
        ArrayList<String > mylist2=new ArrayList<String>();
        mylist2.add("Kroger");
        mylist2.add("Walmart");
        mylist2.add("Express");
        mylist2.add("kavita");
        ArrayList<String > mylist3 =new ArrayList<String>();
        System.out.println("is Arraylist mylist is empty or not  " +mylist3.isEmpty());
        mylist3.add("AAA");
        mylist3.add("aaa");
        mylist3.add("bbb");
        mylist3.add("BBB");

        System.out.println(mylist3.size());
         mylist3.ensureCapacity(50);//providing capacity to arraylist
        mylist3.trimToSize();
        mylist2.replaceAll(i-> i.toLowerCase(Locale.ROOT));//replace all to lower case
        mylist2.replaceAll(i-> i.toUpperCase(Locale.ROOT));

        System.out.println("last index " +mylist3.lastIndexOf("ccc"));
        System.out.println("last index " +mylist3.lastIndexOf("mmm"));
        System.out.println("contains " +mylist3.contains("ccc"));
        //  mylist1.addAll(mylist);
        System.out.println("containsAll " +mylist3.containsAll(mylist2));
        //  System.out.println(mylist.subList(1,3));
        Iterator itrs=mylist2.iterator();
        while(itrs.hasNext())
        {
            System.out.println(itrs.next());
        }
        mylist2.replaceAll(i->i.charAt(0)+"");//print only 1st index that is
        for(int j=0;j<mylist2.size();j++){
            System.out.println(mylist2.get(j));
        }
    }
}
