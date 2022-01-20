public  class FinalClassDemo {
    int i = 10;

    final void display(){
        System.out.println("In final class");
    }
    public static void main(String[] args) {
        FinalClassDemo finalObj = new FinalClassDemo();
        finalObj.display();
    }
}
