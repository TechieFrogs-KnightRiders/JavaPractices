package AssignmentArrayLIstCoding;

import java.util.ArrayList;

public class Prog5 {
    public static void display(ArrayList<String> Planets) {
        for (String Planet : Planets) {
            System.out.println(Planet);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> Planets = new ArrayList<>();
        Planets.add("Jupitor");
        Planets.add("Saturn");
        Planets.add("Earth");
        Planets.add("Mercury");
        display(Planets);//passing arraylist as function parameters  }
    }
}
