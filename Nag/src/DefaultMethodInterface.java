public interface DefaultMethodInterface {

    void display();

    default void myDefaultMethod(){
        System.out.println("In default method");
    }

    static void myStaticMethod(){
        System.out.println("In static of interface");
    }


    public static void main(String[] args) {
        
    }
}
