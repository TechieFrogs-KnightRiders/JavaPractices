//ArrayList Qn8-To sort a given array list:-  (alphabetical order)
import java.util.*;
public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<String>l = new ArrayList<String>();
        l.add("Pen");
        l.add("Pencil");
        l.add("Eraser");
        l.add("Sharpener");
        l.add("Scale");
        System.out.println("Array before sorting: \n"+l);     //[Pen, Pencil, Eraser, Sharpener, Scale]
        Collections.sort(l);                                //(sorts in alphabetical order)
        System.out.println("Array after sorting:\n"+l);      // [Eraser, Pen, Pencil, Scale, Sharpener]
    }
    
}
