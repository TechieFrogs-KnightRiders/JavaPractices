//Arraylist15 Question- Test an Array list is Empty or not
  /* import java.util.*; 
public class ArrayList1518 {
    public static void main(String[] args) {
        ArrayList<String>l = new ArrayList<String>();
        l.add("Black");
        l.add("White");
        l.add("Red");
        l.add("Green");
        l.add("Pink");
        System.out.println(l);
        System.out.println("Checking if empty or not:" + l.isEmpty());        //l.isEmpty() - to check if a list is empty or not
        l.removeAll(l);                                                       //removeAll(l)- to empty/remove all the elements in a list
        System.out.println("Arraylist after removing all elements" +l);
        System.out.println("Checking if empty or not:" +l.isEmpty());  
    }
    
}  */




//Arraylist18 Question- Trim the capacity of an array list to the current list size
  import java.util.*; 
public class ArrayList1518 {
    public static void main(String[] args) {
        ArrayList<String>l = new ArrayList<String>();
        l.add("Black");
        l.add("White");
        l.add("Red");
        l.add("Green");
        l.add("Pink");
        System.out.println("Original list" + l);
        l.trimToSize();
        System.out.println("After trim To size:" +l);
    }
  }    




    

