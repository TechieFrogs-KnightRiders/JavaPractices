public class Triangle2 {
    int a,b,c;
    public Triangle2(int side1, int side2, int side3 ){
        a = side1;
        b = side2;
        c = side3;
        }
        public static void main(String[] args) {
            Triangle2 triangle2Obj = new Triangle2(3,4,5);
        int perimeter = triangle2Obj.a+triangle2Obj.b+triangle2Obj.c;
        int sp=(perimeter/2);
        System.out.println("Perimeter is : "+perimeter);
        int ar=((((sp*(sp-triangle2Obj.a))*(sp-triangle2Obj.b))*(sp-triangle2Obj.c)));
        int area = (int)Math.sqrt(ar);
        System.out.println("Area is : "+area);
            
        }

    
    
}
