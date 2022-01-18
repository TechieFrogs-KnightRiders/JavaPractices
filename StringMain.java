public class StringMain {
    public static void main(String[] args){

    String name1 = new String("Rainbow");
    String name2 = new String("Rainbow");
    System.out.println("Check if two strings are equal");

    boolean result1 = (name1 == name2);  // check if two strings are equal using == operator
    System.out.println("using == operator: "+ result1);

    boolean result2 = name1.equals(name2); //check if two strings are equal using equals() method
    System.out.println("using equals():" + result2);
    }


    
}
