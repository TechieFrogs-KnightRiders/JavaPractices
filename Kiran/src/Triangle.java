public class Triangle {
    int x = 3;
    int y = 4;
    int z = 5;
    
    public static void main(String[] args) {
        Triangle triangleObj = new Triangle();
        int perimeter = triangleObj.x+triangleObj.y+triangleObj.z;
        int sp=(perimeter/2);
        System.out.println("Perimeter is : "+perimeter);
        int ar=((((sp*(sp-triangleObj.x))*(sp-triangleObj.y))*(sp-triangleObj.z)));
        int area = (int)Math.sqrt(ar);
        System.out.println("Area is : "+area);


        

    }


   
        

        
    }
    

