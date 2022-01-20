public class ConversionsDemo {
    public static void main(String[] args) {
        String s = "123";

       // int i = Integer.parseInt(s);

       int i1 = Integer.valueOf(s);

        System.out.println(i1);

        int j = 100;

        String str = String.format("%d",j); // Integer.toString(j); //String.valueOf(j);

        System.out.println(str+10);

        for(int i = 0; i < 10; i++){
            if(i > 5 || (i < 8 && i > 0))
            System.out.println(i+1);
        }

    }
}
