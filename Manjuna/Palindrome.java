package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 161;
		int temp = n;
		int r;
		int sum=0;
		for(;n>0;n = n/10) {
			r= n%10;
			sum = sum*10+r;
		}
			if(temp == sum)
			System.out.println("161 is Palindrome" + sum);
			else
				System.out.println("Not a Palindrome");
	}

}
