public class InheritanceDemo {  // extends Object - class
    int m = 100;
    private String s = "Knightriders";

    public String getS(){
        return s;
    }

    public void setS(String str){
        s = str;
    }

     void display(){
        System.out.println("In parent display");
    }

    private void parentDisplay(){
        System.out.println("In parent display");
    }

    static void newDisplay(){
        System.out.println("In parent static display");
    }

    InheritanceDemo(){  
        //this(100);
        System.out.println("In parent constructor");
    }

    InheritanceDemo(int i){  
        System.out.println("In parent constructor with param "+i);
    }

    public static void main(String[] args) {
        InheritanceDemo inehritObj = new InheritanceDemo();
        inehritObj.display();
        System.out.println(inehritObj.toString());
    }
}
