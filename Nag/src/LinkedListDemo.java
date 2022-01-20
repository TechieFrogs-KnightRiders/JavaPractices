import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
       // LinkedList list = new LinkedList<>();
       // list.add("Hi");
       // list.add(1);

       LinkedList<String> list = new LinkedList<String>();
       list.add("Hi");
       list.add("Hello");
       list.add("Team");
       list.add("Hello");
       list.add("Team");
       list.add("Hello");
       list.add("Team");

       list.removeLast();
       list.removeFirstOccurrence("Team");
       list.removeLastOccurrence("Hello");

       for(int i = 0; i < list.size(); i++){
        System.out.println(list.get(i));
    }

    }
}
