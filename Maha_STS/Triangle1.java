package Assignment1;

public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Triangle1 obj1=new Triangle1(3,4);
	        Triangle1 obj2=new Triangle1(3,4,5);
	        
	    }
	    Triangle1(int b,int h){
	       int a=(b*h)/2;
	        System.out.println("area of Triangle is" +a);
	    }
	    Triangle1(int b,int h,int s){
	        int p=b+s+h;
	        System.out.println("perimeter of Triangle" +p);
	    
	}

}
