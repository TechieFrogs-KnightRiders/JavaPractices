public class factorial {
    public static void main(String[] args) {

        int num = 6;
        long value = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            value =value * i;
        }
        System.out.println("Factorial of "+ num + " is " +value);
    }
}

