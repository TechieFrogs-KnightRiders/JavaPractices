public class FinalDerived extends Integer {

    void display(){
        System.out.println("In child final method");
    }

    public static void main(String[] args) {
        FinalDerived finalObj = new FinalDerived();
        finalObj.display();
    }
}
