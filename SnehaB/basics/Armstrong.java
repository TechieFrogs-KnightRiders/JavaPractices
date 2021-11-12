package com.ts;

public class Armstrong {

	public static void main(String[] args) {
		
		// 16. check number is Armstrong or not?

				int inPut = 153, reminder, total = 0;
				int orgNum = inPut;

				while (inPut != 0) {

					reminder = inPut % 10;
					total = total + (reminder * reminder * reminder);
					inPut = inPut / 10;

				}

				if (total == orgNum)
					System.out.println(orgNum + " is an Armstrong number");
				else
					System.out.println(orgNum + " is not an Armstrong number");

	}

}
