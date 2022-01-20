package AssignmentTreeSet;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Comparator;
import java.util.TreeSet;

class Compare1 implements Comparator<String> {
    public int compare(String str, String str1) {
        String first_str;
        String second_str;
        first_str = str;
        second_str = str1;
        return second_str.compareTo(first_str);//using compareTo() to ensure
    }
}
public class ComparatorProg18 {
    public static void main(String[] args) {
        TreeSet<String> tSS = new TreeSet<>();
        tSS.add("W");
        tSS.add("E");
        tSS.add("L");
        tSS.add("C");
        tSS.add("O");
        tSS.add("M");
        tSS.add("E");

        System.out.println("set Before comparator " + tSS);
        TreeSet<String> tS1 = new TreeSet<String>(new Compare1());
        tS1.addAll(tSS);

        System.out.println("after comparator" + tS1);
    }

}



