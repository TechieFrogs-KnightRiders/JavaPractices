public class methodspractice {
    String reference;
    void Display(){
    System.out.println("Hi all");
    }
methodspractice(){



}
    void greeting(String name){
        reference = name;
    System.out.println("The name is  "+ name);
    }
    public static void main(String[] args) {
        methodspractice classobj = new methodspractice();
        classobj.greeting("Lakshmi");

    }
}


