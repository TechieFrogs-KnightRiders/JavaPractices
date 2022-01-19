package AssignmentHashSet;

import java.util.*;

public class HashsetAppend {
    public static void main(String[] args) {
        HashSet<String> hS=new HashSet<>();
        hS.add("maha");
        hS.add("Mastan");
        hS.add("Chinnu");
        hS.add("Aara");
        //Prog 2
        Iterator it=hS.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Prog 3
        System.out.println(hS.size());
        //Prog5
        System.out.println(hS.isEmpty());
        //Prog 6
        HashSet<String>hS1=new HashSet<>();
        hS1=(HashSet) hS.clone();
        System.out.println("after cloning hashset "+hS1);

        //Prog 7 Convert haset to array
        String arr[]=new String[hS.size()];
        hS.toArray(arr);//conver set to array
        for(String s:arr){
            System.out.println(s);
        }
        //Prog 8 convert hashset to Treeset
        Set<String> hashSettoTreeSet=new TreeSet<String>(hS);
        System.out.println("convert Hashset to TreeSet "+hashSettoTreeSet);//Tree set will print proper(Ascending) order

        // prog 9 convert hashset to list/Arraylist
        ArrayList<String> hashsetToArrayList= new ArrayList<String>(hS);
        System.out.println("Convert Hashset to Arraylist "+hashsetToArrayList);
        List<String> hashsetToList= new LinkedList<String>(hS);
        System.out.println("Convert Hashset to list "+hashsetToList);
        //Prog 12
        hS.removeAll(hS1);
        System.out.println("after removeAll operation "+hS);
        //Prog 4
        hS.clear();
        System.out.println("after empty hash set"+hS);

    }
}
