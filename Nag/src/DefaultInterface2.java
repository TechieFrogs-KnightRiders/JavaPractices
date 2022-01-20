public interface DefaultInterface2 {
    void method2();

    default void newDefault(){
        System.out.println("IN new default");
    }

    default void myDefaultMethod(){
        System.out.println("In default method");
    }

    static void myStaticMethod(){
        System.out.println("In static of interface");
    }

    static void otherStaticMethod(){
        System.out.println("In other static");
    }
}
