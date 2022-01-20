package AssignmentTreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class FindNubProg9To {
    public static void main(String[] args) {
        TreeSet<Integer> tSI = new TreeSet<>();
        tSI.add(22);
        tSI.add(2);
        tSI.add(1);
        tSI.add(5);
        tSI.add(7);
        tSI.add(9);
        tSI.add(25);
        int chek = 7;
        Iterator it = tSI.iterator();
        while (it.hasNext()) {
           int currVal= ((Integer)it.next()).intValue();
            if(currVal >chek) {
                break;//it will break most innerloop here that is while loop.
                // continue it will skip current iteration next iteration will start
            }
            System.out.println(currVal);
        }
        System.out.println("Strictly greater than a given number "+tSI.ceiling(6));
        System.out.println("greater than a given number"+tSI.higher(5));
        it = tSI.iterator();
        while(it.hasNext()){
            int currVal1=((Integer)it.next()).intValue();//Interger is a obj(Class) to compare the values of obj .intValue() method to get premitive int value
          if(currVal1 >= 5)
                System.out.println(currVal1);
        }
        System.out.println("less than or equal of given nub"+tSI.lower(9));
        System.out.println("Strictly lassthan element "+tSI.floor(23));
        it=tSI.iterator();
        while (it.hasNext()){
            int currVal=((Integer)it.next()).intValue();
            if(currVal>=5)
                break;
            System.out.println(currVal);

        }
        System.out.println("elements in set"+tSI);
        //Prog 14 retrive and remove first element
        System.out.println("First element of set Retrive & Remove is "+tSI+" "+tSI.pollFirst()+"  "+tSI);
        //Prog 15 retrive and remove last element
        System.out.println("Last element of set Retrive & Remove is "+tSI+"  "+tSI.pollLast()+" "+tSI);
        // Prog 16 remove
        System.out.println("remove given element "+tSI+"  "+tSI.remove(5)+"  "+tSI);
       //Prog 17 using comparator method
        Comparator  compar=tSI.comparator();
        System.out.println("using comparator method "+compar);
        System.out.println(" tSI obj already prints in a specific order so it is returning null value");
    }
}
