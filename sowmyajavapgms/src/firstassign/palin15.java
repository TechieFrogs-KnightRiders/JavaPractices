package firstassign;

public class palin15 {

	public static void main(String[] args) {
		int n=151,rev=0,rem=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}

}
