package Collections;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
      //  Stack stack=new Stack();
        stack.push("cake");
        stack.add("decoration");
        stack.push("candles");
        stack.push("pizza");
        System.out.println("stack elements "+stack);
        System.out.println("stack is empty "+stack.isEmpty());
        System.out.println("pop method retrive and remove first element "+stack.pop()+ "  " +stack);
               //    popelmnt(stack);
        String BirthDay=stack.peek();
        System.out.println("peek method top element "+BirthDay);
        int Bir=stack.search("decoration");
        System.out.println(" search the object location from the top "+Bir);
        System.out.println("size of stack "+stack.size());
        Iterator itr=stack.iterator();
        while(itr.hasNext()){
            Object obj=itr.next();
            System.out.println(obj);
        }
        System.out.println("iteration over the stack useing foreach() method: ");
    stack.forEach(n->
            {
            System.out.println(n);
            }
            );
    System.out.println("Listiteration over the stack ");
        ListIterator list= stack.listIterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }
}
