import java.util.*; 
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(7,80);

        ArrayList<Integer> a =new ArrayList<>();
        a.add(90);
        a.add(100);
        a.add(110);

       v.addAll(a);
       v.addElement(120);



    }

    
}
