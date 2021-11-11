package practice;

public class Triangle {
	double Area;
	double perimeter;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(3,4,5);
		System.out.println("Area of the Triangle :" + t1.Area);
		System.out.println("Perimeter of the Triangle :" + t1.perimeter);

	}
	Triangle(double s1, double s2,double s3){
		Area = (s1+s2+s3)/2;
		 perimeter =s1+s2+s3;
	}

}
