import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        int i=25;
        String k="Hello";
        boolean b=false;
        ArrayList<Object>arrList = new ArrayList<Object>();
        arrList.add(i);
        arrList.add(k);
        arrList.add(b);
        System.out.println(arrList.size());
    
        for(int i1=0;i<arrList.size();i++){         //traversing arrayList using for loop
            System.out.println(arrList.get(i));
        }

        for(Object object:arrList){                //traversing arrayList using for each loop
            System.out.println(object);
        }

        Iterator itr=arrList.iterator();           //traversing arrayList using for operator
        while(itr.hasNext()){
            System.out.println("From iterator " +itr.next());
        }
    }
}
