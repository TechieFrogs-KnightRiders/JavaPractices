package practice;

public class AreaOfRectangle {
	int length,breadth;
	AreaOfRectangle(int a,int b){
		length = a;
		breadth = b;
	}
	int returnArea() {
		int area = length *breadth;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle rectangle = new AreaOfRectangle(6,10);
		System.out.println("Area of the Rectangle :"+rectangle.returnArea());

	}
	
	

}
