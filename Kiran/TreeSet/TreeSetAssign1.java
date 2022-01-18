package Kiran.TreeSet;
import java.util.TreeSet;

public class TreeSetAssign1 {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        TreeSet<String> tSet1 = new TreeSet<>();
        tSet.add("Red");  
        tSet.add("Green");
        tSet.add("Blue");
        tSet.add("Yellow");

        tSet1.add("Purple");
        tSet1.add("Orange");
        tSet1.add("Black");
        tSet1.add("White");
        System.out.println("Comparing Two Sets :");
        

        for(String str : tSet){
            System.out.println(tSet1.contains(str) ? "Yes" : "No");
        }
        
        
    }
    
}
