package Assignment1;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Triangle obj=new Triangle();
	        obj.area(3,4,5);
	        //obj.perimeter();

	    }
	   // void perimeter(int p,int )
	    void area(int side,int base,int height)
	    {
	        int a,p;
	        a=(height*base)/2;
	        p=side+base+height;
	        System.out.println("perimiter" +p);
	        System.out.println("area of Triangle is" +a);
	    }

	    
	

}
