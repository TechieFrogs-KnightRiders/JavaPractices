package practice;

public class LeftpascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int rows = 8;
		for(i = 1;i<=rows;i++) {
			for( j =i;j<rows;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(i =rows;i>=1;i--) {
			for(j=i;j<=rows;j++) {
				System.out.print(" ");
			}
			for(k=1;k<i;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
