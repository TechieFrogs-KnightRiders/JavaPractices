import java.util.*; 
public class LinkedListOne {
    public static void main(String[] args) {
      LinkedList <String>l = new LinkedList<String>(); 
      l.add("Seeta");
      l.add("25");
      l.add(null);
      l.add("Ravi");                                        //[Seeta,25,null,Ravi]
      l.set(0,"Teacher");                                   //[Teacher,25,null,Ravi]
      l.add(0,"Nag");                                       //[Nag,Teacher,25,null,Ravi]
      l.removeLast();                                       //[Nag,Teacher,25,null]
      l.addFirst("hello");                                  //[hello,Nag,Teacher,25,null]
      System.out.println(l);

    }
    
}
