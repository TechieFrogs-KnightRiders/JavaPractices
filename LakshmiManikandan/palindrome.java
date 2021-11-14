public class palindrome { 
    
        public static void main(String[] args) {
           int num = 151;
           int num2=num;
           int reverse = 0;
           while(num>0){
            reverse = (reverse*10)+num%10;
            num = num/10;
           }
           System.out.println("The reverse of the given number is  "+ reverse);
        if (num2==reverse){
            System.out.println(reverse + " The given number is palindrome");
        }
        }
    }
    

