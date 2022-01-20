public class MethodLocalInnerDemo {
    int m = 30;
    void outer(){
        System.out.println("In outer");
        if(m == 30){
            int a = 10;
            //local inner class
            class IfClass{
                int e = 30;
                void ifDisplay(){
                    System.out.println("In if display "+a+" "+m);
                    //display();
                }
            }
            IfClass ifObj = new IfClass();
            ifObj.ifDisplay();
        }
    }
    void display(){
         int l = 20;
        System.out.println("In display");
        
        // Method Local Inner Class or Local Inner class
        class LocalClass{
            int k = 10;
            void localDisplay(){
                System.out.println("In local display"+k+"  "+l+"  "+m);
                outer();
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.localDisplay();
    }

    //Member class
    class MemberClass{
        int z = 20;
    }

    public static void main(String[] args) {
        MethodLocalInnerDemo methodObj = new MethodLocalInnerDemo();
        methodObj.outer();
    }
}
