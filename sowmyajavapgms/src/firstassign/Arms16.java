package firstassign;

public class Arms16 {

	public static void main(String[] args) {
		int n=153,sum=0,rem=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
