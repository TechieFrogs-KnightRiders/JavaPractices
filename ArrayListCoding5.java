//Pass Array list as function parameter
import java.util.*; 
public class ArrayListCoding5 {
    public static void display(ArrayList<String>colours){
        System.out.println("ArrayList: ");
        for(String colour : colours)
          {
              System.out.println(colour +", ");
          }

    }
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();       //creating a array list
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("White");
        colours.add("Orange");
        System.out.println("ArrayList is:" +colours);

        display(colours);
    }
    
}
