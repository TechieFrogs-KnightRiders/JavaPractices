package Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList arr=new ArrayList();//Creating Arraylist in raw but Constructs an empty list with an initial capacity of ten.
        ArrayList<String> myList=new ArrayList<String>();//Creating ArrayList in Generic(<>) way
        myList.add("Hockey");//inserting elements to ArrayList
        myList.add("Cricket");
        myList.add("vollyball");
        myList.add("Tennis");
        myList.set(1,"Shettle");//replace the element

        System.out.println(myList.size());
        //Traversing Arraylist using for loop
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        //Traversing Arralist using for each
        for(Object obj:myList){
            System.out.println(obj);
        }
        System.out.println("Sorting Generic ArrayList");
        Collections.sort(myList);
        Iterator itr1=myList.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
System.out.println("creating another arraylist non generic means not any particular type of data ");
        ArrayList<Object> myarrList=new ArrayList<Object>();//Creating Arraylist non-generic but in generic manner
        myarrList.add(10);//in this Arraylist we r inserting different type of data. Type is (Object)
        myarrList.add("Keera");
        myarrList.add(true);

        //Traversing the Arraylist using Iterator
       Iterator itr= myarrList.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
        ListIterator listitr=myarrList.listIterator(myarrList.size());
       while(listitr.hasPrevious()) {
           System.out.println(listitr.previous());
       }
       ListIterator listitr1=myList.listIterator(myList.size());//list Iterator
       while(listitr1.hasPrevious()){//it will check is there any values or no if yes then it will execute
           System.out.println(listitr1.previous());//list Iteerator previous() is used to print reverse order
       }

    }
}
