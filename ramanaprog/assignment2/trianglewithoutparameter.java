package assignments2;

public class trianglewithoutparameter {
    int a,b,c,area,perimeter;
	public trianglewithoutparameter()
	{
		 a=3;
		 b=4;
		 c=5;
		 perimeter=a+b+c;
		 area=(b*c)/2;
		 System.out.println("in constructer");
	}
	void display() {

		 System.out.println("perimeter="+ perimeter);
		 System.out.println("area="+ area);
	}
	
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trianglewithoutparameter obj =new trianglewithoutparameter();
		obj.display();

	}
    
}
