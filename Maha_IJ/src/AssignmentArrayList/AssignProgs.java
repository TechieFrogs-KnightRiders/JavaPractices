package AssignmentArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AssignProgs {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Yellow");
        //prog3 Adding specified position
        colors.add(1,"Red");
        //prog2 iterating arraylist
        Iterator itr=colors.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //prog4 retrieve element with specified Index
        System.out.println("Specified Index \n"+colors.subList(1,3));

        //prog 5 update a specific array element
        colors.set(1,"Babypink");
        for(int i=0;i<colors.size();i++)
        System.out.println(colors.get(i));

        //prog6 Remove the 3rd Element from arraylist
        System.out.println("removing element "+colors.remove(3));
        System.out.println("after removing "+colors);
        // Prog 7 searching an element
        System.out.println("searching an element "+colors.get(1));
        ArrayList<String> States=new ArrayList<>();
        States.add("MP");
        States.add("Ap");
        States.add("TN");
        States.add("Delhi");
        States.sort(null);
        //prog 8 sort arraylist
      //  Collections.sort(States);
        Iterator itt=States.iterator();
        while(itt.hasNext()){
            System.out.println(itt.next());

        }

    }
}
