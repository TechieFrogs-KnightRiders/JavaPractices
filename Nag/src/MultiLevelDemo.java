public class MultiLevelDemo extends InheritanceChild{

    void myMultiDisplay(){
        System.out.println("In muslti display");
    }
    void heirDisplay(){
        System.out.println("In heir display");
    }

    MultiLevelDemo(){
       super(100);
        System.out.println("In multi constructor");
    }

    public static void main(String[] args) {
        MultiLevelDemo multiObj  = new MultiLevelDemo();
        multiObj.display();
        newDisplay();
        

    }
}
