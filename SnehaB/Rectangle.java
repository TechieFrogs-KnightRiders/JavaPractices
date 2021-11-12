public class Rectangle {

    int length;
    int breadth;

    public static void main(String[] arg) {

        Rectangle rObj = new Rectangle(4, 5);
        System.out.println(rObj.Area());

        Rectangle rObj2 = new Rectangle(5, 8);
        System.out.println(rObj2.Area());


    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    int Area() {
        int area = this.length * this.breadth;
        return area;


    }
}
