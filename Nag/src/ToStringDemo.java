public class ToStringDemo {

    int i;
    String name;

    ToStringDemo(){
        i = 20;
        name = "Knights";
    }

    public String toString(){

        return i+"   "+name;
    }

    public static void main(String[] args) {
        ToStringDemo t1 = new ToStringDemo();

        ToStringDemo t2 = new ToStringDemo();

        System.out.println(t1); // compiler will call toString() method of ur Object class
        System.out.println(t2); 
    }
}
