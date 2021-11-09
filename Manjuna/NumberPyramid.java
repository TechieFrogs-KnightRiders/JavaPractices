package practice;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int k =0;
		for(int i =1;i<=rows;i++) {
			k = i-1;
			
			for(int j=i;j<=rows-1;j++) {
				
				System.out.print("  "); 
				
			
			}
			for(int j = 0;j <=k;j++)
			
			System.out.print((i+j)  < 10?(i+j)+" ":(i+j)+"  ");
			for(int j =1;j<=k;j++)
				System.out.print((i+k-j)<10 ? (i+k-j)+" ":(i+k-j) +" ");
				System.out.println();
				
			}
		
		}
	}


