package practice;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 35;
		int n2 = 55;
		int Gcd = 1;
		for(int i = 1; i <= n1 && i <= n2;i++ ) {
			if(n1%i == 0 && n2%i ==0)
		     Gcd = i;
		
		}
			
			System.out.printf("Gcd of two numbers is : %d and %d = %d ", n1 ,n2, Gcd);
		
		
	}

}
