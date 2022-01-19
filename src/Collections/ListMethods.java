package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMethods {
    public static void main(String[] args) {
       // ArrayList<int> list=new ArrayList<int>(); it will not allow primitive type only classes we need to provide
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);
        list.set(2,25);//replacing the 2nd index element with set method
        list.add(1,15);//adding element in desired index
        list.add(50);
        Iterator itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
System.out.println("Creating another Arraylist");
    ArrayList<Object> myarr=new ArrayList<Object>();
        myarr.add("aaa");
        myarr.add(1);
        myarr.add(true);
        myarr.add("kkkk");
        myarr.add(100);
      //  list.addAll(myarr);
        // list is integer type so it can not add object type(because objtype will take different data type)
        myarr.addAll(list);//here myarr is obj type it will take any datatype so we can add integer Arraylist
        //it will add at the end of array

        for(int i=0;i<myarr.size();i++) {
            System.out.println(myarr.get(i));
        }

        myarr.addAll(1,list);//it will add the ArrayList(list) at index 1
        myarr.remove("kkkk");//removing that particular object
        myarr.removeAll(list);//removing the entire list (Arraylist )

        for(int i=0;i<myarr.size();i++) {
            System.out.println(myarr.get(i));
        }
        System.out.println("retainAll mehtod only duplicates will print");

        myarr.retainAll(list);
        Iterator itr1=myarr.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        ListMethods listobj=new ListMethods();  //creating object of class
        ListMethods listobj1=new ListMethods();
        ListMethods listobj2=new ListMethods();
        ListMethods listobj3=new ListMethods();
        ArrayList<ListMethods> mylistobj=new ArrayList<ListMethods>();//creating our own Arraylist object
mylistobj.add(listobj);
mylistobj.add(listobj1);
mylistobj.add(listobj2);

    }
}

