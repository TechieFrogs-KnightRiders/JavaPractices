package Collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class EmpDetails{
    int id;
    String FName,LName;
    EmpDetails(int id,String FName,String LName){
        this.id=id;
        this.FName=FName;
        this.LName=LName;

    }
}
public class CreatingOwnTypeList {
    public static void main(String[] args) {
        //creating list of EmpDetails
        List<EmpDetails> dll=new LinkedList<EmpDetails>();
        EmpDetails e1=new EmpDetails(101,"Maaya","Maddineni");
        EmpDetails e2=new EmpDetails(101,"Maari","Mayya");
        EmpDetails e3=new EmpDetails(101,"Sirisha","Himani");
        EmpDetails e4=new EmpDetails(101,"Asma","Godugu");
dll.add(e1);
dll.add(e2);
dll.add(e3);
dll.add(1,e4);
for(EmpDetails e:dll){
    System.out.println(e.id+" "+e.FName+" "+e.LName);
}
String[] str={"Geek","Seek","Site"};
    //Converting arrays to arraylist with Arrays.asList() method
       List<String> arr=Arrays.asList(str);
       System.out.println(arr);
       //converting arrays to arraylist with Method2 collections.addAll()
   List<String> list=new ArrayList<String >();
   Collections.addAll(list,str);
   System.out.println(list);
   //converting arrays to arraylist with Method3 Iteration
   List<String> arr1=new ArrayList<String>();
    for(String s:arr1){
        arr1.add(s);
    }
    }
}
