public class Area1 {

    int length;
    int breadth;

    public static void main(String[] args) {

        Area1 aObj = new Area1();
        aObj.setDim(4, 6);
       int area = aObj.getArea();
       System.out.println("area : " + area);
    }

    void setDim(int length, int breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    int getArea (){

        return  length * breadth;
    }
}
