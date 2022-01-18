import java.util.*;
public class ArrayListCoding1 {
    public static void main(String[] args) {
        ArrayList<Character> Arr = new ArrayList<Character>();
        Arr.add('c');
        Arr.add('f');
        Arr.add('l');
        Arr.add('i');
        Arr.add('s');
        Arr.add('t');
        Arr.add('c');
        
        
        System.out.println("Frequency of element c in the list:" + Collections.frequency(Arr,'c'));
        System.out.println("Frequency of element s in the list:" + Collections.frequency(Arr,'s'));
    }
    
}
