public class TriangleWithParCons {

    int height;
    int base;
    int side;

    public static void main(String[] args) {

        TriangleWithParCons tObj = new TriangleWithParCons(3,4,5);
        tObj.clacAreaandMethod();

    }

    TriangleWithParCons(int height, int base,int side) {

        this.height = height;
        this.base = base;
        this.side = side;
    }


    void clacAreaandMethod () {

        int area = (this.height * this.base)/ 2;
        System.out.println("area : " + area);

        int parameter = this.height * this.base * this.side;
        System.out.println("parameter : "+ parameter);
    }
}
