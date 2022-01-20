// We should use this along with some classes or interfaces

abstract class MyAnonymousClass{
    abstract void display();
}

public class AnonymousClassDemo {

    public static void main(String[] args) {
        // Can create instance using the anonymous way for the interfaces and abstarct classes 
        MyAnonymousClass anObj = new MyAnonymousClass(){
             int i = 10;

            void display(){
                System.out.println("In display");
            }

            class InnerClass{
                int l = 20;
                void inner(){
                    System.out.println("In inner");
                }
            }

        };
        anObj.display();
        
        
    }
}
