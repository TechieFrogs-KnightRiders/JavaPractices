//insert an element into the array list at the first position
import java.util.*; 
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Goat");
        animal.add("Sheep");
        System.out.println(animal);
        animal.add(0,"Horse");
        System.out.println(animal);
    }
    
}
