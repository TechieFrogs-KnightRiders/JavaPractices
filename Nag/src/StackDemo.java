import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(20);
        stack.add(40);
        stack.push(30);
        stack.add(40);

        stack.addElement(50);

        stack.pop();

        System.out.println(stack.indexOf(30));

       System.out.println( stack.search(20));

       

       // stack.clear();
        
        System.out.println(stack.peek());


        System.out.println("My stack elements:");
       // System.out.println(stack);

        ListIterator itr = stack.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
