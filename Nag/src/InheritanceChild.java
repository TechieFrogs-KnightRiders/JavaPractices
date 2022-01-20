public class InheritanceChild extends InheritanceDemo{
    int j = 20;
    void myDisplay(){
        System.out.println("In child mydisplay");
    }

     void heirDisplay(){
        System.out.println("In heir display of parent");
    }

    static void myMethod(){
        System.out.println("In static parent ");
    }

    InheritanceChild(){
       // int j  =10;
       
       // super(); 
    //this(20);
        System.out.println("In my child constructor");
    }

    InheritanceChild(int k){
        // super();
        //this();
        super(k); 
        System.out.println("In child param constructor "+k);
        
    }

    
    public static void main(String[] args) {
        InheritanceChild childObj = new InheritanceChild(100);
        childObj.myDisplay();
        //System.out.println(childObj.s);
        childObj.display();
        childObj.setS("Knights");
        System.out.println(childObj.getS());
        //childObj.parentDisplay(); // unable to access as they are defined as private
        newDisplay(); // as it is static and related with inheritance
    }
}
