package AssignmentLinkeList;

import java.util.LinkedList;

public class Prog10To {
    public static void main(String[] args) {
        LinkedList<String> LLArr=new LinkedList<String>();
        LLArr.add("Ulichi");
        LLArr.add("Chiraala");
        LLArr.add("Ongole");
        LLArr.add("Hyderabad");
        System.out.println("Peek method "+LLArr.peek());//retrives the first element in list
        System.out.println("pop method "+LLArr.pop());//It pops an element from the stack represented by a list
        //System.out.println("Peek method "+LLArr.peek());
        System.out.println("First occurance "+LLArr.getFirst());
        System.out.println("Last occurance "+LLArr.getLast());

        for(int a=0;a<LLArr.size();a++){
            System.out.println("Index " +a+ " " +LLArr.get(a));
        }
    System.out.println("Removing a specified Index "+LLArr.remove(2));
        System.out.println("Removing First Element "+LLArr.removeFirst());
        System.out.println("Removing Last Element "+LLArr.removeLast());
    LLArr.clear();
System.out.println("After removing all elements "+LLArr);
    }
}
