package AssignmentArrayList;

import java.util.ArrayList;

public class Prog16To {
    public static void main(String[] args) {
        ArrayList<String> Astr=new ArrayList<String>();
        Astr.add("CVS");
        Astr.add("Walgreens");
        Astr.add("Kroger");
        //Prog 16 Copy the elements
        ArrayList<String> Aobj=Astr;
        for(String s1:Aobj){
           System.out.println(s1);
        }




    }
}
