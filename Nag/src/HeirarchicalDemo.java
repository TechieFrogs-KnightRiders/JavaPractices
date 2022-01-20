public class HeirarchicalDemo extends InheritanceChild{
    int j = 10;
     void heirDisplay(){  // overriden method - having same name as parent method
            // public > protected > default > private - visibility order
        // In the overriding we can improve the accessbility or maintian same but cannnot reduce the visisbility
        super.heirDisplay();
        System.out.println("In heir display");
        System.out.println("child j = "+this.j+"  parent j = "+ super.j);
       
    }

    static void myMethod(){
        System.out.println("In static child ");
    }

    void display(){
        this.heirDisplay();
    }

    public static void main(String[] args) {
        HeirarchicalDemo heirObj = new HeirarchicalDemo();
        heirObj.heirDisplay();
        heirObj.display();
        InheritanceChild.myMethod();
        //myMethod();
        //this.heirDisplay();
       // heirObj.myM
    }
}
