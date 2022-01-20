public class DefaultDriverClass implements DefaultMethodInterface, DefaultInterface2{
    public static void main(String[] args) {
        DefaultDriverClass defObj = new DefaultDriverClass();
        defObj.myDefaultMethod();
        defObj.newDefault();
        DefaultMethodInterface.myStaticMethod();
        DefaultInterface2.otherStaticMethod();
        DefaultInterface2.myStaticMethod();
        //super.myDefaultMethod();
    }

    static void myStaticMethod(){

    }

    //overriding the default method from interface
    public void myDefaultMethod(){
        System.out.println("In class default override");
        DefaultMethodInterface.super.myDefaultMethod();
    }

    public void newDefault(){
        System.out.println("In new default from class");
        DefaultInterface2.super.newDefault();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("In my display method");
    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        
    }
}
