package src.firstassign;

class Degree1 
{
	void getdegree()
	{
		System.out.println("I got a Degree");
	}
}
class UnderGraduate extends Degree1
{
	void print()
	{
		System.out.println("I am an UnderGraduate");
	}
}
class PostGraduate extends Degree1
{
	void print()
	{
		System.out.println("I am an PostGraduate");
		
	}
}
class Degree
{
	public static void main(String[] args) 
	{
		Degree1 d=new Degree1();
		UnderGraduate u=new UnderGraduate();
		PostGraduate p=new PostGraduate();
		d.getdegree();
		u.print();
		p.print();
		
		
	}
}