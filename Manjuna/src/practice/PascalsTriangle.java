package practice;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coef = 1;
		int row = 6;
		for(int i = 0;i < row;i++) {
			for(int j = 1;j<row-i;++j) {
				System.out.print("  ");
			}
			for(int k =0;k <= i;k++) {
				if(k==0 || i==0)
					coef =1;
				else
					coef = coef * (i - k + 1) /k;
				System.out.printf("%4d" , coef);
				
			}
			System.out.println();
		}

	}

}
