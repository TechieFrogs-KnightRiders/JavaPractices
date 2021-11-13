package assignments2;

public class trianglewithparameters {
    int a,b,c,perimeter,area;
     public trianglewithparameters(int x,int y,int z ){
             a=x;
             b=y;
             c=z; 
             System.out.println("in constructer");
             area=(y*z)/2;
             perimeter=x+y+z;
         }
             void display(){//System.out.println("in method");
             System.out.println("area"+"="+area);
             System.out.println("perimeter"+"="+perimeter);
             
        }
        
    
    
    
        public static void main(String[] args) {
            trianglewithparameters obj=new trianglewithparameters(3,4,5);
            obj.display();
    
        }
}
