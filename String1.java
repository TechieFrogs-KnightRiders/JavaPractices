public class String1 {
    public static void main(String [] args){
        String s= "I love my country 123";
        int vowels =0;int consonants;int digits =0; int spaces =0;

        s= s.toLowerCase();
        for(int i=0; i< s.length();++i){
        char ch = s.charAt(i);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
         ++vowels;
        }

        else if(ch>='0' && ch <='9'){
            ++digits;
        }

        else if((ch>='a' && ch<='z')){
            ++consonants;
        }
        else if(ch==' '){
            ++spaces;
        }
    }
    System.out.println("Vowels: " + vowels);
    System.out.println("Digits: " + digits);
    System.out.println("Consonants:" + digits);
    System.out.println("White spaces:" + spaces);
}

 }
    

