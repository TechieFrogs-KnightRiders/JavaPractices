package src.firstassign;

public class PrintIntChar 
{
	int i;
	char c;
	void print(int a,char b)
	{
		i=a;
		c=b;
		System.out.println("integer = "+i+" "+"character = "+ b);
	}
	void print(char b,int a)
	{
		i=a;
		c=b;
		System.out.println("character = "+ b+" "+"integer = "+i);
	}
	

	public static void main(String[] args) 
	{
		PrintIntChar pi=new PrintIntChar ();
		pi.print(16,'S');
		pi.print('N',9);

	}

}
