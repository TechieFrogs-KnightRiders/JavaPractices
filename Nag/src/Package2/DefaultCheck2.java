package Package2;

import Package1.DefaultCheck;

public class DefaultCheck2 extends DefaultCheck{

    DefaultCheck2(){
        super(100);
    }

    public static void main(String[] args) {
        DefaultCheck2 defaultObj = new DefaultCheck2();
        defaultObj.display();
        defaultObj.newDisplay();
        defaultObj.k  = 20;
        defaultObj.i  = 30;
    }
}
