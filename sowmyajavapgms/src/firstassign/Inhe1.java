package src.firstassign;

class InheDemo
{
	void show()
	{
		System.out.println("This is parent class");
	}
	public static void main(String[] args) 
	{
		InheDemo i1=new InheDemo();
		 i1.show();
	}
}

public class Inhe1 extends InheDemo
{
	void display()
	{
		System.out.println("This is child class");
	}
	public static void main(String[] args) 
	{
		 
		 Inhe1 i=new  Inhe1();
		 i.display();
		 i.show();
		
	}
}
