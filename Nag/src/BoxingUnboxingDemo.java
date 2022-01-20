public class BoxingUnboxingDemo {
    public static void main(String[] args) {
        int i = 100;

        long l = i; // widening

       // Long l = i; // not corresponding types

       // int m = l;

        Integer j = i; // Assigning primitive to wrapper class  - Boxing or Autoboxing

        int k = j;  // Assigning wrapper class to primitive - Unboxing

        display(l);

    }

    static void display(Long i){
        System.out.println("My value is "+i);
    }
}
