package firstassign;

public class pyramidnums23 {

	public static void main(String[] args) {
		int n=7,z=1;
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=(n-i);sp++)
			{
				System .out .print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j>(z-i)/2)
					z--;
				else
					z++;
				System.out.println(z);
				
				System.out.println();
	        }	
		}
}
}
