package practice;

public class Rectangle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.Area(4, 5);
		r.Area(5, 8);
		

	}
	void Area(double h,double w) {
		System.out.println("Area of the Rectangle :" + h*w);
	}

}
