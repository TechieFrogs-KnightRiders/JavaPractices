package AssignmentHashSet;

import java.util.*;
import java.util.stream.Collectors;

public class RetainallProg11 {
    public static void main(String[] args) {
        HashSet<Integer> hashS=new HashSet<Integer>();
        hashS.add(1);
        hashS.add(2);
        hashS.add(3);
        hashS.add(4);
        HashSet<Integer> hashS1=new HashSet<>();
        hashS1.add(3);
        hashS1.add(4);
        hashS1.add(5);
        hashS1.add(6);

      //  hashS.retainAll(hashS1);
        System.out.println("after ratainAll operation "+hashS);
        //Prog12
       // hashS.removeAll(hashS1);
        System.out.println("after removeAll operation "+hashS);
        //Prog 13 convert array to hash set and vice-versa
        String arr[]={"a","b","c"};
        Set<String > integetSet=new HashSet<String>(Arrays.asList(arr));
        System.out.println("Converting Arrays to Hashset "+integetSet);

        // Convert set to array
        Set<String> sStr=new HashSet<>();
        sStr.add("mm");
        sStr.add("nn");
        sStr.add("oo");
        String arra[]=new String[sStr.size()];
        sStr.toArray(arra);
System.out.println("converting set to array " +Arrays.toString(arra));
//Prog 14 union of 2 sets
        sStr.addAll(integetSet);
        System.out.println("union of 2 sets"+sStr);
        //Prog 15 intersection
       // hashS.retainAll(hashS1);
        System.out.println("Intersection of 2 sets "+hashS);
        //Prog 16 difference b/n 2 sets
        hashS.removeAll(hashS1);
        System.out.println("difference b/n 2 sets "+hashS);
        //Prog 17 if a set is subset of another set
       // hashS.contains(hashS1);
        System.out.println("sub set"+ hashS.contains(hashS1));

    }
}
