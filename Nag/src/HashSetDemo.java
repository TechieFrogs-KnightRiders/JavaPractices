import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(30);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(40);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);
        hashSet.add(40);
        hashSet.add(100);
        hashSet.add(200);

        hashSet.remove(40);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(60);

       
       // arrayList.removeAll(hashSet);

      //  System.out.println(arrayList.size());
       // hashSet.clear();

       HashSet<Integer> hashSet1 = (HashSet<Integer>) hashSet.clone();
      // System.out.println(hashSet1.size()+"  cloned set size before");


      //  System.out.println(hashSet.size());

        hashSet.removeAll(arrayList);

        hashSet.addAll(arrayList);

       hashSet.removeIf(i1->i1.equals(50));
        

     //   System.out.println(hashSet1.size()+"  cloned set size after remove");
      //  System.out.println(hashSet.size());


        Iterator i = hashSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
