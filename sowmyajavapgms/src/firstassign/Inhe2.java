package src.firstassign;

class InheDemo1
{
	private void show()
	{
		System.out.println("This is parent class");
	}
	public static void main(String[] args) 
	{
		InheDemo1 i1=new InheDemo1();
		 i1.show();
	
	}
}

public class Inhe2 extends InheDemo1
{
	void display()
	{
		System.out.println("This is child class");
	}
	public static void main(String[] args) 
	{
		 Inhe2 i=new  Inhe2();
		 i.display();
		 i.show(); //because it is declared as private in parent class.
		
	}
}

