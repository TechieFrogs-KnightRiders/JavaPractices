public class TypePromotion {

    

   static void display(int a, long b){
        System.out.println("In long "+ (a + b));
    }

    static void display(float f, double d){
        System.out.println("In floating "+(f + d));
    }
    public static void main(String[] args) {
        display(10,20); // c promotes to int and then to long
        display(5,50.50); // value promoted from int to float
    }
}
