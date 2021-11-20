package src.firstassign;

public class SquRec
{
	int area(int a)
	{
		return a*a;
	}
	int area(int l ,int b)
	{
		return l*b;
	}

	public static void main(String[] args) 
	{
		SquRec s  = new SquRec();
		System.out.println("Area of a Square = " + s.area(10));
		System.out.println("Area of a Rectangle = " + s.area(10,12));
		

	}

}
