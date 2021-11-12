package firstassign;

public class Prime14 {

	public static void main(String[] args) {
		int n=18,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				 count++;
			}
		}
		if(count==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");

	}

}
