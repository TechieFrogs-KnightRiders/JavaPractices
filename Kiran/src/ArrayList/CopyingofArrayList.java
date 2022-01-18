package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CopyingofArrayList {
  public static void main(String[] args) {
      ArrayList<Object> lst = new ArrayList<Object>();
      lst.add(30);
      lst.add(60);
      lst.add("Hi");

      ArrayList<Object> lst1 = new ArrayList<Object>();
      lst1.add(120);
      lst1.add(90);
      lst1.add("Everyone");

      Collections.copy(lst, lst1);
      System.out.println(lst+" "+lst1);
     
      
  }  
}
