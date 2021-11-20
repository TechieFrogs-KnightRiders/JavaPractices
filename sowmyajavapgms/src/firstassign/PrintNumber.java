package src.firstassign;

public class PrintNumber 
{
	int x;
	String s;
	char c;
	float f;
	int printn(int a)
	{
		x=a;
		return x;
	}
	String printn(String b,int c)
	{
		s=b+c;
		return s;
	}
	char printn(char d)
	{
		c=d;
		return c;
	}
	float printn(float e,int g)
	{
		f=e+g;
		return f;
	}

	public static void main(String[] args) 
	{
		PrintNumber p=new PrintNumber ();
		System.out.println(p.printn(16));
		System.out.println(p.printn('s'));
		System.out.println(p.printn(16.26f,16));
		System.out.println(p.printn("Sowmya",16));
		
	}

}
