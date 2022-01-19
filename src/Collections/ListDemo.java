package Collections;
import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        //creating list using ArrayList
        List<String> LApara=new ArrayList<>();
        List<Integer> LLpara=new LinkedList<>();
        LApara.add("ddd");
        LApara.add("keera");
        LLpara.add(10);
        LLpara.add(20);
        LLpara.add(5);
        LLpara.add(8);
        String array[]={"aaa","bbb","ccc"};
        System.out.println("convert array to arraylist"+Arrays.toString(array));
     //   LApara.add(array);// directly we can not add because it s arraytype string and declaring List is String type not String Array
        for(String data:array){//converting array to list
            LApara.add(data);
        }
        List<String> LApara1=new ArrayList<>();
        LApara1.add("Thirumala");
        LApara1.add("Thirupati");
    System.out.println(LApara);
        //converting list to array
        String array1[]=LApara1.toArray(new String[LApara1.size()]);
        //Traversing elements forward direction
        ListIterator<String> iter=LApara1.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        //Traversing elements in backward direction
        System.out.println("Backward direction");
        while(iter.hasPrevious()){
            System.out.println("Index" +iter.previousIndex()+"  "+iter.previous());
        }
System.out.println("after converting list ot array"+Arrays.toString(array1));
        //get method to access particular index and set method to set value at particular index
        System.out.println("get method "+LApara1.get(1));
        LApara1.set(1,"Chittur");
        for(String Devote:LApara1){
            System.out.println(Devote);
        }
        //sort the list
        Collections.sort(LLpara);
        for(int Name:LLpara) {
            System.out.println(Name);
        }
        //
    }
}
