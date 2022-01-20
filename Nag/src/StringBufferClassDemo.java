public class StringBufferClassDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer(); // capacity - 16
        StringBuffer str1 = new StringBuffer("Knights"); // capacity = 16 + length of the given string
        StringBuffer str2 = new StringBuffer(100); // capacity - given value
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(str1);
        System.out.println(str1.capacity()); // capacity  = 23
        System.out.println(str2.capacity()); // capacity = 100

        // append method
        str.append("Hello Team");
        str1.append(" Riders Team");
        System.out.println(str1+"  "+str1.capacity());

        // insert() method
        str.insert(10, ". Welcome");
        System.err.println(str+"   "+str.capacity());

        //replace() method
        str.replace(5, 10, "Nag");
        System.out.println(str);

        //delete() method
        str.deleteCharAt(5); //single character
        System.out.println(str);
        str.delete(5, 10);
        System.out.println(str);

        //reverse() method - reverse words and characters in the words as well
        str.append(" Welcome All to the Java training");
        str.reverse();
        System.out.println(str.length()+"  "+str+"  "+str.capacity());

        str2.append("Hello Team. Welcome to our training and plcament program which enhances your ability. We are Knight Riders.");
        System.out.println(str2.length()+"  "+str2.capacity());

        str2.ensureCapacity(210); // old * 2 + 2 = 202 * 2 + 2 = 404 + 2 = 406
        System.out.println(str1.capacity());

        str1.ensureCapacity(100);
        System.out.println(str1.length()+" "+str1.capacity());

        StringBuilder strB = new StringBuilder();
        StringBuilder strB1 = new StringBuilder("Knights");
        StringBuilder strB2 = new StringBuilder(100);



    }
}
