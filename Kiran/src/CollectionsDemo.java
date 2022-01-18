import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Arrays;
import java.util.Collections;





public class CollectionsDemo {

    public static void main(String[] args) {

       String[] str = {"Sup?","Hi"};

        
       /*  int i = 10;
        String s = "HI";

        int a = 11;*/

        
         ArrayList<Object> Obj = new ArrayList<Object>();
         
        Obj.add(10);
        Obj.add("HI");
        Obj.add(20);
        System.out.println(Obj.size());
        System.out.println("Array List "+ Obj);
        
        //Converting from ArrayList to Array

        Object[] objects = Obj.toArray();  

        for(Object list : objects){
            System.out.print(list+" ");
        }
        System.out.println();
        

        List<String> t = Arrays.asList(str);
        System.out.println(t);
    }
}         
      

       
        
        
        
       
        

      
        

       
    

       
            
    
