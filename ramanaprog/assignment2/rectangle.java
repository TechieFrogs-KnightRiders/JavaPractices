package assignments2;

public class rectangle {
    int l,b,area;
	public rectangle(int x,int y){
		l=x;
		b=y;
		area=x*y;
		
	}
	void area() {
		System.out.println("rectangle area"+"="+area);
	}

	public static void main(String[] args) {
		rectangle r1=new rectangle(4,5);
		rectangle r2=new rectangle(5,8);
		r1.area();
		r2.area();

	}
    
}
