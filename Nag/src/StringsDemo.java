public class StringsDemo{
    public static void main(String[] args) {
        String str = "Knight Riders"; // String literal

        String str1 = "Knight Riders";

        String s = new String("Knight Riders"); // String class

        String s1 = "knight Riders";  // share the same memory location from String Constant Pool(SCP) with str
        
        char[] ch = {'k','n','i','g','h','t'};

        String s3 = new String(ch); 

        System.out.println(s+"  "+s1+"   "+s3);

        str.concat(" Team"); //  new string in SCP created 'Knight Riders Team'

      //  System.out.println(str);

        str = str.concat(" Team"); //  new string in SCP created 'Knight Riders Team' and points the new ref to str

      //  System.out.println(str);

        str = str1;

       // System.out.println(str);

      //  System.out.println(str.equals(s));

      //  System.out.println(str.equalsIgnoreCase(s));

     //   System.out.println(str == s1); // values and references too

        //Compare to method

        String s10 = "  Sach  in  "; // a = 97 or S = 83
                    //012345678910
        String s11 = "Sachin Ramesh Tendulkar"; // O - 111 or R = 82

        String s12 = "KniGHts";

       // System.out.println(s11.compareToIgnoreCase(s10));

      //  System.out.println(s11.length()+"   "+s10.length());

        // Sub-String methods

        
        System.out.println(s11.substring(5));

        System.out.println(s11.substring(5, 12));

        //Uppercase and Lowercase

        System.out.println(s12.toLowerCase());
        System.out.println(s12.toUpperCase());

        //trim

        System.out.println(s10+"  trimmed value = "+s10.trim());

        //startsWith() and endsWith()

        System.out.println(s11.startsWith("Ra"));
        System.out.println(s11.endsWith("are"));

        //charAt(index)

        System.out.println(s11.charAt(5));

        //replace()

        System.out.println(s11.replace("Sa", "Nag"));








    }
}
