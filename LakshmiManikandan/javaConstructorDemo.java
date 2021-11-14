public class javaConstructorDemo{
    public static void main(String[] args) {
    int i=10;
    javaConstructorDemo demo1 = new javaConstructorDemo(100);
    javaConstructorDemo demo2 = new javaConstructorDemo(200.50);
    javaConstructorDemo demo3 = new javaConstructorDemo("Lakshmi");
    demo2.display();
}
javaConstructorDemo(int k)
{
System.out.println("the value of k: "+ k);

}
javaConstructorDemo (double l){
    this("Lakshmi");    
    System.out.println("the value of l: " + l);
    int i = 200;
    System.out.println("the value of i: "+ i);
}
javaConstructorDemo(String m){

    System.out.println("the name is "+m);
}
void display (){

    System.out.println("Constructors Demo and usage");
}
}