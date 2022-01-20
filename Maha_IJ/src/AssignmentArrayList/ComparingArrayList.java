package AssignmentArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ComparingArrayList {
    public static void main(String[] args) {
        ArrayList<String> Astr1=new ArrayList<String>();
        Astr1.add("Mango");
        Astr1.add("Apple");
        Astr1.add("Guava");
        ArrayList<String> Astr2=new ArrayList<String>();
        Astr2.add("Mango");
        Astr2.add("Apple");
        Astr2.add("Guava");
        boolean b=Astr1.equals(Astr2);
        System.out.println(b);
        System.out.println(Astr1.size());
        Astr1.trimToSize();
        for(Object obj:Astr1){
            System.out.println(obj);
        }
        //Prog 19 Increase the capacity of Array
        Astr1.ensureCapacity(5);
       // System.out.println(Astr1.size());
        Astr1.add("coconut");
        Astr1.add("Orange");
        Astr1.add("Banana");
        System.out.println(Astr1);

        //Prog 20 Cloning
        ArrayList<String> Astr3=(ArrayList<String>)Astr2.clone();
        for(int i=0;i<Astr3.size();i++) {
            System.out.println("after cloning" + Astr3.get(i));
        }
            //Prog 21 join 2 Arraylists and prog 22 printing by position
            ArrayList<String> planet=new ArrayList<String>();
            planet.add("sun");
            planet.add("Moon");
            planet.add("Earth");
            planet.addAll(Astr3);
            for(int k=0;k<planet.size();k++){

                System.out.println(" Index " +k+ " " +planet.get(k));
            }
            

    }
}
