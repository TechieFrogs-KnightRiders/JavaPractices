public class sumOfnaturalNumberswhileLoop {
    public static void main(String[] args) {
        int i=  10;
        int l=0;
        int k=1;
        while(i>=k){
            l=l+k;
            k=k+1;
        }
        System.out.println("The sum of given natural numbers is " + l);
    }
}
