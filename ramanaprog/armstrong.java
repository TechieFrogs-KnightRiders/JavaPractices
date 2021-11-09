package assignment;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp=n;
		int sum=0,r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum =sum+r*r*r;	
		}
		if(temp==sum)
			System.out.println("it is an armstrong number");
		else
			System.out.println("not an armstrong number");
		
		
	}

}
