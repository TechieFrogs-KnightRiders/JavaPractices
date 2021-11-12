package com.ts;

public class Palindrome {

	public static void main(String[] args) {
		
         // 15. check number is Palindrome or not?

		int pali = 121, outPut = 0;
		int orgiNum = pali;

		for (; pali != 0; pali = pali / 10) {

			int rem = pali % 10;
			outPut = (outPut * 10) + rem;

		}
		if (orgiNum == outPut)
			System.out.println(orgiNum + " is Palindome number");
		else
			System.out.println(orgiNum + " is not an Palindome number");

	}

}
