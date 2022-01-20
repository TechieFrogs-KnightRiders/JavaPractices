import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public class ArrayListDemo {
    public static void main(String[] args) {
        int i1 = 10;
        String k = "Hi";
        boolean b = true;
        ArrayList<Object> arrList = new ArrayList<Object>();
        arrList.add(i1);
        arrList.add(k);
        arrList.add(b);
        System.out.println(arrList.size());
        arrList.set(1,"Knights");
       

        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("Cricket");
        myArrList.add("VolleyBall");
        myArrList.add("BasketBall");
        myArrList.add("Football");

        myArrList.add(2, "Hockey");

        arrList.addAll(0, myArrList);

        arrList.remove("Cricket");
        arrList.remove(1);
        //arrList.removeAll(myArrList);

       // arrList.retainAll(myArrList);

        
        Collections.sort(myArrList);

        myArrList.replaceAll(i -> i.charAt(0)+"");
        
        System.out.println("Array List items:");
        // Traversing the ArrayList using for loop
        for(int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }

        System.out.println("My Array List items:");
        // Traversing the ArrayList using for loop
        for(int i = 0; i < myArrList.size(); i++){
            System.out.println(myArrList.get(i));
        }


        arrList.ensureCapacity(50);


        arrList.trimToSize();


       // ListIterator listItr = myArrList.listIterator(myArrList.size());
       // System.out.println(listItr.hasNext());
      //myArrList.li
     //   while(listItr.hasPrevious()){
     //       System.out.println(listItr.previous());
     //   }


       /* // Traversing the ArrayList using for each loop
        for (Object object : arrList) {
            System.out.println(object);
        }

        // Traversing the ArrayList using for iterator
        Iterator itr = arrList.iterator();
        while(itr.hasNext()){
            System.out.println("From iterator  "+itr.next());
        }*/

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(1);
        newList.add(2);
        

        ArrayListDemo ar1 = new ArrayListDemo();
        ArrayListDemo ar2 = new ArrayListDemo();
        ArrayListDemo ar3 = new ArrayListDemo();

        ArrayList<ArrayListDemo> myObjList = new ArrayList<ArrayListDemo>();

        myObjList.add(ar1);
        myObjList.add(ar2);






        
    }
    
    

}
