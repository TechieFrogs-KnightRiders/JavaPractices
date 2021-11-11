package practice;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String primenumbers = " ";
		
		for(int i = 1;i<=20;i++ ) {
			int counter = 0;
			for(int num = i;num >=1;num--) {
				
			
			if(i%num == 0) {
				counter = counter+1;
				
			}
			
		}
			if(counter ==2) {
				
				primenumbers = primenumbers + i +" ";
			}
		}
		System.out.println("PrimeNumbers: " +primenumbers);
	}

}
