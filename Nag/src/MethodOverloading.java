public class MethodOverloading {

    void display(){
        System.out.println("In display");
    }

    void display(int i){
        System.out.println("In int display");
    }

    void display(String s){
        System.out.println("In String display");
    }

    void display(int i, String s){
        System.out.println("In double display");
    }

    void display(String s, int i){
        System.out.println("In double display");
    }


    public static void main(String[] args) {
        MethodOverloading methodObj = new MethodOverloading();
        methodObj.display(10);

        System.out.println(10 + 10);
        System.out.println('6'+ 100);
    }

}
