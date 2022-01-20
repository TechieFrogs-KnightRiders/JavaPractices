public class AccessModifiersDemo {

    private int m = 10;

     void display(){  // default
        System.out.println("In display");
    }

     AccessModifiersDemo(){
        System.out.println("In constructor");
    }

    AccessModifiersDemo(int i){
        System.out.println("In param constructor");
    }
    public static void main(String[] args) {
        AccessModifiersDemo accessObj = new AccessModifiersDemo();
        accessObj.display();
    }
}
