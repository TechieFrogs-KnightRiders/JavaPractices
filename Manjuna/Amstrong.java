package practice;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 370;
		int temp = num;
		int sum=0,r;
		for(;num!=0;num = num/10) {
			r = num%10;
			sum = sum+r*r*r;
		}
		if(temp == sum)
			System.out.println("370 is an Amstrong Number");
		else 
			System.out.println("Not an Amstrong Number");

	}

}
