package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Assign {
    public static void main(String[] args) {
        
      ArrayList<Object> lst = new ArrayList<Object>();
     
      lst.add("G");
      lst.add("E");
      lst.add("E");
      lst.add("K");
      lst.add("S");
      lst.add(1);
      lst.add(1);
      lst.add(2);
      lst.add(3);
      lst.add(3);
      lst.add(4);

      System.out.println("Array List :"+lst);
      

      Set<Object> lst1 = new HashSet<Object>(lst);
      

      for(Object x : lst1){
        if(lst.contains(x)){
          System.out.print("Present in the Array List ");
        }else{
          System.out.print("Not present in the Array List ");
        }
        
       System.out.println(x +" : "+Collections.frequency(lst, x));
       
       
          
      }
      
      
      
      
      }
    }
 

       
                        
                        
                       


                     
                     
                    
                   

        
    
                



    

        
      
       

        

        

       
        

       
    

    
