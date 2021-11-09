package practice;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f =1;
		int n = 6;
		while( n >0) {
			f= f*n;
	
			n--;
		}
		
		System.out.println("Factorial of 6 is :"+f);

	}

}
