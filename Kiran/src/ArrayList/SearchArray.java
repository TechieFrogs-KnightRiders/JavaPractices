package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
      
        ArrayList<Object> lst = new ArrayList<Object>();

        lst.add(25);
        lst.add(30);
        lst.add(60);
        lst.add(90);
        lst.add(120);
        lst.add("Hello");

        System.out.println("Array list "+lst);
        System.out.println();
        
        if(lst.contains(60)){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Not Found ");
        }
       
        
        
        }
    }
    

