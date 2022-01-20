package Package1;

public class DefaultCheck {
     int i = 20;
     protected int k = 30;

     void display(){
        System.out.println("In display");
    }

    protected void newDisplay(){
        System.out.println("In display");
    }

     DefaultCheck(){
        System.out.println("In constructor");
    }

    public DefaultCheck(int i){
        System.out.println("In param constructor");
    }

    public static void main(String[] args) {
        
    }
}
