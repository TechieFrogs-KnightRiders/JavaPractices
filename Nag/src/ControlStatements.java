public class ControlStatements {
    private static int yeild;

    public static void main(String[] args) {
        boolean b = false, a = false;

        int x = 15; // Integer

        Integer i = 15; 
        
        String k = switch(i) {
                    case 15 :
                        i = 20;
                        yield "5";
                    //System.out.println();
                    
                    case 20 :
                        i = 30;
                        yield "10" ;
                    
                    default:
                    System.out.println("In default");
                    yield "Nothing matched";

        };
        System.out.println("After switch case "+k);
        System.out.println(i);
        
        

    }
}
