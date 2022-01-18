 import java.util.*;
    public class HashSetAssignment13 {
        public static void main(String[] args) {
           /* ArrayList<String> a = new ArrayList<String>();
            a.add("Ravi");
            a.add("Maha");
            a.add("Manju");
            a.add("Akhil");
            a.add("100");
            a.add("200");
            a.add("Akhil");
            a.add("Maha");  
            
            System.out.println("Original set :" +a);       //o/p- duplicates allowed   */

    HashSet<String> a  = new HashSet<>();
            a.add("Ravi");
            a.add("Maha");
            a.add("Manju");
            a.add("Akhil");
            a.add("100");
            a.add("200");

            String[] array = new String[a.size()];
            a.toArray(array);
            System.out.println(Arrays.toString(array));
            
        }
    }
