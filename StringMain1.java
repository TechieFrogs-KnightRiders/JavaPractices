public class StringMain1 {
    public static void main(String [] args){
        String first = "Doctor";      //Lets create 3 strings
        String second= "Doctor";
        String third= "Patient";

        boolean result1 = first.equals(second); // comparing first and second string
        System.out.println("String first and second are equal:" + result1);

        boolean result2 = first.equals(third); // comparing first and third string
        System.out.println("String first and third are equal:" + result2);


    }
    
}
