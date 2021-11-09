package assignment;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=128;
		int rem =0;
		int rev =0;
		int c=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
			if(c==rev)
				System.out.println("palindrome");
			else
				System.out.println("not palindrome");

	}

}
