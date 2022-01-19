package AssignmentLinkeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prog15To {
    public static void main(String[] args) {
        LinkedList<String> SchoolList=new LinkedList<String>();
        SchoolList.add("aaa");
        SchoolList.add("bbb");
        SchoolList.add("ccc");
        SchoolList.add("ddd");
        System.out.println("Before Swap elements"+SchoolList);
        Collections.swap(SchoolList,0,2);
        System.out.println("After Swaping elements"+SchoolList);
        Collections.shuffle(SchoolList);
        System.out.println("Shuffled elements"+SchoolList);
        LinkedList<Object> AllList=new LinkedList<Object>();
        AllList.add("12");
        AllList.add("Maha");
        AllList.add("Diya");
        //Prog 17 join 2 linkedlist
       // AllList.addAll(SchoolList);
        //Prog 18 cloning
    LinkedList<String> LList=(LinkedList<String>)SchoolList.clone();
    System.out.println("After cloning " +LList);
    //Prog 19 remove and retrieve
   System.out.println(AllList.remove());
   System.out.println("Retrive the First Element "+AllList.getFirst());
        System.out.println("Retrive the Last Element "+AllList.getLast());
        System.out.println("Checking the particular Element is there or not \n"+AllList.contains("Diya"));
        //Prog 23 Converting Linked list to Arraylist
        System.out.println(" Converting Linked list to Arraylist ");
        List<String > list1=new ArrayList<String>(SchoolList);
        for(String st:list1){
            System.out.println(st);
        }
        //Prog 24 Comparing 2 linked lists
        System.out.println("Comparing 2 linked lists \n");
        System.out.println(SchoolList.equals(AllList));
        System.out.println("Checking a linked list is empry or not \n"+SchoolList.isEmpty());
        System.out.println("Repalacing the element "+SchoolList.set(1,"baat"));
        System.out.println("After replacing "+SchoolList);
    }
}
