public class amstrongProgram {
   public static void main(String[] args) {
       int num1 = 153;
       int arm = 0;
       while (num1>0){
        int rem = num1%10;
        arm = arm +(rem*rem*rem);
        num1 = num1/10;
       }
       if (num1 == arm){
       
        System.out.println("The given number is armstrong number ");
       }
        else{
            System.out.println("The given number is armstrong number");
        }
       }
       
}
