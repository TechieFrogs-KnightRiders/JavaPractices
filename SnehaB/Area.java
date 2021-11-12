public class Area {

    int length;
    int breadth;

    public static void main(String[] arg) {

        Area aObj = new Area(5, 6);
        int area = aObj.returnArea();
        System.out.println("area : " + area);

    }

    Area(int x, int y) {
        length = x;
        breadth = y;
    }
    int returnArea(){
        int area = length * breadth;
        return area;
    }
}
