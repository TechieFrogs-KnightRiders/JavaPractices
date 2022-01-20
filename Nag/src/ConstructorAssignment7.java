public class ConstructorAssignment7 {
    int length, breadth;

    ConstructorAssignment7(int length, int b){
        this.length = length;
        breadth = b;
    }

    int returnArea(){
        int area = length * breadth;
        return area;
    }
    public static void main(String[] args) {
        ConstructorAssignment7 consObj = new ConstructorAssignment7(5, 9);
        //int area = consObj.returnArea();
        System.out.println("My area is "+consObj.returnArea());

        
    }
}
